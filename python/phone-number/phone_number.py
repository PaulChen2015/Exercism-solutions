class Phone(object):
    import re
    pattern = r'^\s*(?:\+?1?)?[-. (]*([2-9]\d{2})[-. )]*([2-9]\d{2})[-. ]*(\d{4})\s*$'
    prog = re.compile(pattern)

    def __init__(self, phone_number):
        result = self.prog.match(phone_number)
        if not result:
            raise ValueError(f'Invalid phone number: {phone_number}')

        self.area_code, self.exchange_code, self.subscriber_number = result.groups()
        self.number = ''.join(result.groups())


    def pretty(self):
        return f'({self.area_code}) {self.exchange_code}-{self.subscriber_number}'


