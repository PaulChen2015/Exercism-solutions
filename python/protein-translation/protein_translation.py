def proteins(strand):
    codon_protein = {
        "AUG": "Methionine",
        "UUU": "Phenylalanine",
        "UUC": "Phenylalanine",
        "UUA": "Leucine",
        "UUG": "Leucine",
        "UCU": "Serine",
        "UCC": "Serine",
        "UCA": "Serine",
        "UCG": "Serine",
        "UAU": "Tyrosine",
        "UAC": "Tyrosine",
        "UGU": "Cysteine",
        "UGC": "Cysteine",
        "UGG": "Tryptophan",
        "UAA": "STOP",
        "UAG": "STOP",
        "UGA": "STOP",
    }

    step = 3
    strand = [strand[i:i+step] for i in range(0, len(strand), step)]

    result = []
    for codon in strand:
        protein = codon_protein.get(codon)
        if protein == "STOP":
            break
        result.append(protein)

    return result

    

    
