// Assertions

type One = string
type Two = string | number
type Three = 'Hello'

// convert to more or less specific 

let a: One = 'Hello'
let b = a as Two // less specific
let c = a as Three // more specific

let d = <One> 'world'
let e = <string |number> 'world'

const addOrConcat = (a: number, b: number, c: 'add' | 'concat'): number | string =>{
    if(c === 'add') return a + b
    return '' + a + b
}

let myVal : string = addOrConcat(2, 2, 'concat') as string

// be careful! TS sees no Problem here but a string is returned
let nextVal : number = addOrConcat(2, 2, 'concat') as number

// nicht zulässig
// 10 as string

// avoid that if possible
(10 as unknown) as string

// the DOM
const img = document.querySelector('img') ! 
const myImg = document.getElementById('#img') as HTMLImageElement
const nextImg = <HTMLElement> document.getElementById('#img')

img.src
myImg.src





















