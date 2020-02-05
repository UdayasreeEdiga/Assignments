function print(message) {
    var names = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        names[_i - 1] = arguments[_i];
    }
    for (var _a = 0, names_1 = names; _a < names_1.length; _a++) {
        var n = names_1[_a];
        console.log(message + "" + n);
    }
}
console.log("a", "b", "c");
