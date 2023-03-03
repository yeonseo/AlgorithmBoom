const { toCamelCase, decodeMorse } = require("./script");


// FOR FILE NAME
function toCamelCase(str) {
    var regExp = /[-_\s]\w/ig;
    return str.replace(regExp, function (match) {
        return match.charAt(1).toUpperCase();
    });
}

console.log(toCamelCase("Convert string to camel case"));
console.log(decodeMorse("···· · −·−−   ·−−− ··− −·· ·"));