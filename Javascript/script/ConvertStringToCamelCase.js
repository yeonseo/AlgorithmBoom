function toCamelCase(str) {
    let replaceStr = str;
    let convert = '-'
    let countUp = (replaceStr.match(/\-/g) || []).length;
    let countDown = (replaceStr.match(/\_/g) || []).length;
    if (countUp) {
        for (i = 0; i < countUp; i++) {
            const index = replaceStr.indexOf(convert);
            replaceStr = replaceStr.replace(convert + replaceStr.charAt(index + 1), replaceStr.charAt(index + 1).toUpperCase());
        }
    }
    if (countDown) {
        convert = '_'
        for (i = 0; i < countDown; i++) {
            const index = replaceStr.indexOf(convert);
            replaceStr = replaceStr.replace(convert + replaceStr.charAt(index + 1), replaceStr.charAt(index + 1).toUpperCase());
        }
    }
    return replaceStr;
}

// Best Practices
// function toCamelCase(str) {
//     var regExp = /[-_]\w/ig;
//     return str.replace(regExp, function (match) {
//         return match.charAt(1).toUpperCase();
//     });
// }

module.exports = {
    toCamelCase: toCamelCase
};