let a = 1;
let b = 2;

[a, b] = [b, a]

console.log(a);
console.log(b);


console.log();

const colors = ["red", "blue", "yellow", "black", "white"];

[colors[0], colors[3]] = [colors[3], colors[0]];

console.log(colors);

console.log();

const[firstcol, secondcol, thirdcol, ...extracolors] = colors;

console.log(firstcol);
console.log(secondcol);
console.log(thirdcol);
console.log(extracolors);

console.log();

const person1 = {
    fn: "Juan",
    ln: "mah",
    age: 30,
    job: "Cook",
}

const person2 = {
    fn: "ee",
    ln: "ss",
    age: 22,
}
/*
const {fn, ln, age, job} = person1;
console.log(fn);
console.log(ln);
console.log(age);
console.log(job);
*/

const {fn, ln, age, job = "unn"} = person2;
console.log(fn);
console.log(ln);
console.log(age);
console.log(job);

console.log();

function display({fn, ln, ae, job}){
    console.log(`name: ${fn} ${ln}`);
    console.log(`Age: ${age}}`);
    console.log(`Job: ${job}`);
}
