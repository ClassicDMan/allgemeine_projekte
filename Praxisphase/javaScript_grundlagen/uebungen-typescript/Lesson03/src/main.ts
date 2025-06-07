// Functions:


// type Aliases
type stringOrNumber = string | number

type strongOrNUmberArray = (string | number) []



type Guitarist = {
    name: string,
    active?: boolean,
    albums: (string | number)[],
}

type UserId = stringOrNumber

type postId = stringOrNumber

// Literal types
let myName : 'Juan'

let userName : 'Juan' | 'Dave' | 'Amy'

userName = 'Amy'

// functions

const add = (a: number, b: number) : number =>{
    return a + b
}

const logMessage = (message: any): void =>{
    console.log(message)
}

logMessage('Hello')
logMessage(add(2, 3))
logMessage('Hello')

let sub = function (c: number, d: number) : number {
    return c - d
}

type mathFunction = (a: number, b: number) => number
/*
interface mathFunction {
    (a: number, b: number) : number

}
*/
let multiply: mathFunction = function (c, d){
    return c * d
}

logMessage(multiply(2, 2))

// optional parameters:
const addAll =(a: number, b: number, c?: number) : number =>{

    if (typeof c !== 'undefined'){
        return a + b + c
    }else{
        return a + b
    }
    
}

// default param value
const sumAll =(a: number = 10, b: number, c: number = 2) : number =>{
    return a + b + c
}

logMessage(addAll(2, 3, 2))
logMessage(addAll(2, 3))
logMessage(sumAll(undefined, 3))

// Rest Parameters
const total = (...nums : number[]): number =>{
    return nums.reduce((prev, curr) => prev + curr)
}

logMessage(total(1, 2, 3, 4,))

// never type
const createError = (errMsg: string): never =>{
    throw new Error(errMsg)
}

const infinite = () =>{
    let i : number = 1
    while(true){
        i++
        if(i > 100) break
    }
}

const numberOrString = (value: number | string) : string =>{
    if(typeof value === 'string') return 'string'
    if(typeof value === 'number') return 'number'
    return createError ('this should never happen') 
}

// costum type guard
const insNumber = (value: any): boolean => {
    return typeof value == 'number'
        ? true : false

}

