// Arrays and Objects

let stringArr = ['one', 'hey', 'Juan']

let guitars = ['Start', 'Les Paul', 5150]

let mixedData = ['EvH', 1988, true]

stringArr[0] = 'firstElementChnage'

stringArr.push('pushLastElement')

guitars[0] = 1982
guitars.unshift('addingElementToTheStart')

console.log(guitars)

guitars = stringArr

console.log(guitars)

mixedData = guitars

console.log(mixedData)

let test = []

let bands: string[] = []
bands.push('BandAdded')



// Tuple
// ein Tupel ist strenger als ein Array --> Length Streng --> Variablen Streng
let myTuple: [string, number, boolean] = ['Juan', 22, true]

let mix = ['John', 11, false]

mix = myTuple

// nicht zulässig --> Tuple ist definiert --> Length und data, arrays sind flexibel --> arrays könne mehr data enthalten
// myTuple = mix


// Objects

let myObj: object
myObj = []
console.log(typeof myObj)

myObj = bands
myObj = {}

const exampleObj = {
    prop1: 'aa',
    prop2: true,
}

exampleObj.prop1 = 'aaaaaaa'
exampleObj.prop2 = false

/*
type Guitarist = {
    name: string,
    active?: boolean,
    albums: (string | number)[],
}
*/

// mit interface anstatt type => {OK}
interface Guitarist {
    name: string,
    active?: boolean,
    albums: (string | number)[],
}

let evh: Guitarist = {
    name: 'Juan',
    active : false,
    albums : [1998, 1999, 'adad'],
}

// wir haben in Zeile 62 active als boolean | undefined definiert
let jp: Guitarist = {
    name: 'jimmy',
    active: true,
    albums : ['I', 'II', 'IV'],
}


evh = jp



const greetGuitaris = (guitarist: Guitarist)=> {
    return `Hello ${guitarist.name}!`
}
const greetGuitaris2 = (guitarist: Guitarist)=> {
    return `Hello ${guitarist.name.toUpperCase()}!`
}

console.log(greetGuitaris(jp))
console.log(greetGuitaris2(jp))


enum Gradess {
    U , A, B, C, D
}

console.log(Gradess.U)
console.log(Gradess.A)

enum Grades {
    U = 50 , A, B, C, D
}

console.log(Grades.U)
console.log(Grades.A)
console.log(Grades.B)
console.log(Grades.C)

const enum Color{
    Red,
    Blue,
    Green
}

let c: Color = Color.Blue
console.log(c)



