pub fn is_leap_year(year: u64) -> bool {
    divisable(year, 4) && (!divisable(year, 100) || divisable(year, 400))
}

fn divisable(a: u64, b: u64) -> bool {
    (a % b) == 0
}
