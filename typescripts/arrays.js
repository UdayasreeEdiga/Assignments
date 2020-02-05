var marks;
marks = [90, 86, 99];
var subjects = ["a", "b", "c", "d", "e", "f", "g"];
for (var _i = 0, subjects_1 = subjects; _i < subjects_1.length; _i++) {
    var sub = subjects_1[_i];
    console.log(sub);
}
subjects.push("abc");
subjects.push("uday");
for (var _a = 0, subjects_2 = subjects; _a < subjects_2.length; _a++) {
    var sub = subjects_2[_a];
    console.log(sub);
}
console.log("Top Element =" + subjects.pop());
console.log(subjects.slice(1, 5));
console.log(subjects.splice(2, 0, "Angular 8"));
