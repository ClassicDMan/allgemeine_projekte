"use strict";
// Functions:
// Literal types
let myName;
let userName;
userName = 'Amy';
// functions
const add = (a, b) => {
    return a + b;
};
const logMessage = (message) => {
    console.log(message);
};
logMessage('Hello');
logMessage(add(2, 3));
logMessage('Hello');
let sub = function (c, d) {
    return c - d;
};
/*
interface mathFunction {
    (a: number, b: number) : number

}
*/
let multiply = function (c, d) {
    return c * d;
};
logMessage(multiply(2, 2));
// optional parameters:
const addAll = (a, b, c) => {
    if (typeof c !== 'undefined') {
        return a + b + c;
    }
    else {
        return a + b;
    }
};
// default param value
const sumAll = (a = 10, b, c = 2) => {
    return a + b + c;
};
logMessage(addAll(2, 3, 2));
logMessage(addAll(2, 3));
logMessage(sumAll(undefined, 3));
// Rest Parameters
const total = (...nums) => {
    return nums.reduce((prev, curr) => prev + curr);
};
logMessage(total(1, 2, 3, 4));
// never type
const createError = (errMsg) => {
    throw new Error(errMsg);
};
const infinite = () => {
    let i = 1;
    while (true) {
        i++;
        if (i > 100)
            break;
    }
};
const numberOrString = (value) => {
    if (typeof value === 'string')
        return 'string';
    if (typeof value === 'number')
        return 'number';
    return createError('this should never happen');
};
// costum type guard
const insNumber = (value) => {
    return typeof value == 'number'
        ? true : false;
};
