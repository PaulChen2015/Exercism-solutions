use regex::Regex;

pub fn main() {
    let re = Regex::new(r"[ \t\n]+").unwrap();
    let s = "   a \t b  \n";
    println!("{}", re.replace_all(s, ""));
}