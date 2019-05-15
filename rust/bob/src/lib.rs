const FINE: &str = "Fine. Be that way!";
const CALM: &str = "Calm down, I know what I'm doing!";
const CHILL: &str = "Whoa, chill out!";
const SURE: &str = "Sure.";
const WHATEVER: &str = "Whatever.";


pub fn reply(message: &str) -> &str {
    let msg: &str = message.trim();

    match msg.is_empty() {
        true => FINE,
        false => {
            let yell = msg.chars().any(char::is_alphabetic) && msg.to_uppercase().eq(msg);
            let question = msg.ends_with("?");

            match (yell, question) {
                (true, true) => CALM,
                (true, false) => CHILL,
                (false, true) => SURE,
                (false, false) => WHATEVER,
            }
        }
    }  

}

