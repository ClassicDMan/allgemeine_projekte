"use strict";
// Assertions
// convert to more or less specific 
let a = 'Hello';
let b = a; // less specific
let c = a; // more specific
let d = 'world';
let e = 'world';
const addOrConcat = (a, b, c) => {
    if (c === 'add')
        return a + b;
    return '' + a + b;
};
let myVal = addOrConcat(2, 2, 'concat');
// be careful! TS sees no Problem here but a string is returned
let nextVal = addOrConcat(2, 2, 'concat');
// nicht zulässig
// 10 as string
// avoid that if possible
10;
// the DOM
const img = document.querySelector('img');
const myImg = document.getElementById('#img');
const nextImg = document.getElementById('#img');
img.src;
myImg.src;
