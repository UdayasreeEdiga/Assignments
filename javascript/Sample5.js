today = new Date();
console.log(today);

myDob = new Date("1998-12-30");
console.log(myDob);

age = today.getFullYear()-myDob.getFullYear();
console.log(age);

console.log(today.toISOString());
console.log(today.toDateString());
console.log(today.toTimeString());