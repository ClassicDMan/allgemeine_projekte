"use strict";
// Arrays and Objects
let stringArr = ['one', 'hey', 'Juan'];
let guitars = ['Start', 'Les Paul', 5150];
let mixedData = ['EvH', 1988, true];
stringArr[0] = 'firstElementChnage';
stringArr.push('pushLastElement');
guitars[0] = 1982;
guitars.unshift('addingElementToTheStart');
console.log(guitars);
guitars = stringArr;
console.log(guitars);
mixedData = guitars;
console.log(mixedData);
let test = [];
let bands = [];
bands.push('BandAdded');
// Tuple
// ein Tupel ist strenger als ein Array --> Length Streng --> Variablen Streng
let myTuple = ['Juan', 22, true];
let mix = ['John', 11, false];
mix = myTuple;
// nicht zulässig --> Tuple ist definiert --> Length und data, arrays sind flexibel --> arrays könne mehr data enthalten
// myTuple = mix
// Objects
let myObj;
myObj = [];
console.log(typeof myObj);
myObj = bands;
myObj = {};
const exampleObj = {
    prop1: 'aa',
    prop2: true,
};
exampleObj.prop1 = 'aaaaaaa';
exampleObj.prop2 = false;
let evh = {
    name: 'Juan',
    active: false,
    albums: [1998, 1999, 'adad'],
};
// wir haben in Zeile 62 active als boolean | undefined definiert
let jp = {
    name: 'jimmy',
    active: true,
    albums: ['I', 'II', 'IV'],
};
evh = jp;
const greetGuitaris = (guitarist) => {
    return `Hello ${guitarist.name}!`;
};
const greetGuitaris2 = (guitarist) => {
    return `Hello ${guitarist.name.toUpperCase()}!`;
};
console.log(greetGuitaris(jp));
console.log(greetGuitaris2(jp));
var Gradess;
(function (Gradess) {
    Gradess[Gradess["U"] = 0] = "U";
    Gradess[Gradess["A"] = 1] = "A";
    Gradess[Gradess["B"] = 2] = "B";
    Gradess[Gradess["C"] = 3] = "C";
    Gradess[Gradess["D"] = 4] = "D";
})(Gradess || (Gradess = {}));
console.log(Gradess.U);
console.log(Gradess.A);
var Grades;
(function (Grades) {
    Grades[Grades["U"] = 50] = "U";
    Grades[Grades["A"] = 51] = "A";
    Grades[Grades["B"] = 52] = "B";
    Grades[Grades["C"] = 53] = "C";
    Grades[Grades["D"] = 54] = "D";
})(Grades || (Grades = {}));
console.log(Grades.U);
console.log(Grades.A);
console.log(Grades.B);
console.log(Grades.C);
let c = 1 /* Color.Blue */;
console.log(c);
