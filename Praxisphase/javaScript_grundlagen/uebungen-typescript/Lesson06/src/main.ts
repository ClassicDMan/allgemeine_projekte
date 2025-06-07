// Generics:

const echo = <T> (arg: T): T => arg

const isObj = <T> (arg: T): boolean =>{
    return(typeof arg === 'object' && !Array.isArray(arg) && arg !== null)


}

console.log(isObj(true))
console.log(isObj('string'))
console.log(isObj([1, 2, 3]))
console.log(isObj({name: 'adad'}))
console.log(isObj(null))

const isTrue = <T> (arg: T): {arg : T, is: boolean} => {
    if(Array.isArray(arg) && !arg.length){
        return{arg, is: false}
    }
    if(isObj(arg) && !Object.keys(arg as keyof T).length){
        return{arg, is: false}
    }
    return {arg, is: !!arg}
}

console.log(isTrue(false))
console.log(isTrue(0))
console.log(isTrue(true))
console.log(isTrue(1))
console.log(isTrue('Jahaha'))
console.log(isTrue(''))
console.log(isTrue(null))
console.log(isTrue(undefined))
console.log(isTrue({}))
console.log(isTrue({name: 'rzrzrz'}))
console.log(isTrue([]))
console.log(isTrue([1, 2, 3]))
console.log(isTrue(NaN))
console.log(isTrue(-0))




interface BoolCheack<T> {
    value: T,
    is: boolean
}



const checkBoolValue = <T> (arg: T): BoolCheack<T> => {
    if(Array.isArray(arg) && !arg.length){
        return{value: arg, is: false}
    }
    if(isObj(arg) && !Object.keys(arg as keyof T).length){
        return{value: arg, is: false}
    }
    return {value: arg, is: !!arg}
}

console.log(checkBoolValue(false))
console.log(checkBoolValue(0))
console.log(checkBoolValue(true))
console.log(checkBoolValue(1))
console.log(checkBoolValue('Jahaha'))
console.log(checkBoolValue(''))
console.log(checkBoolValue(null))
console.log(checkBoolValue(undefined))
console.log(checkBoolValue({}))
console.log(checkBoolValue({name: 'rzrzrz'}))
console.log(checkBoolValue([]))
console.log(checkBoolValue([1, 2, 3]))
console.log(checkBoolValue(NaN))
console.log(checkBoolValue(-0))


interface HasID{
    id: number
}

const proc = <T extends HasID> (user: T) : T => {
    // process the user with logic here
    return user
}

console.log(proc({id: 11, name: 'adadada'}))
//console.log(proc({name: 'adadada'}))






const getUserProp = <T extends HasID, K extends keyof T>(users: T[], key:K): T[K][] => {
    return users.map(user => user[key])
}
const usersArray = [
    {
        "id": 1,
        "name": "Leanne Graham",
        "username": "Bret",
        "email": "Sincere@april.biz",
        "address": {
            "street": "Kulas Light",
            "suite": "Apt. 556",
            "city": "Gwenborough",
            "zipcode": "92998-3874",
            "geo": {
                "lat": "-37.3159",
                "lng": "81.1496"
            }
        },
        "phone": "1-770-736-8031 x56442",
        "website": "hildegard.org",
        "company": {
            "name": "Romaguera-Crona",
            "catchPhrase": "Multi-layered client-server neural-net",
            "bs": "harness real-time e-markets"
        }
    },
    {
        "id": 2,
        "name": "Ervin Howell",
        "username": "Antonette",
        "email": "Shanna@melissa.tv",
        "address": {
            "street": "Victor Plains",
            "suite": "Suite 879",
            "city": "Wisokyburgh",
            "zipcode": "90566-7771",
            "geo": {
                "lat": "-43.9509",
                "lng": "-34.4618"
            }
        },
        "phone": "010-692-6593 x09125",
        "website": "anastasia.net",
        "company": {
            "name": "Deckow-Crist",
            "catchPhrase": "Proactive didactic contingency",
            "bs": "synergize scalable supply-chains"
        }
    },
]
// siehe function getUserProp:
// we pass an array of users so that it will be represented 
// --> users: T[] 
// we are able to map through out the keys without using an assertion 
// beacuse we are using 
// K extends keyof T
console.log(getUserProp(usersArray, "email"))
console.log(getUserProp(usersArray, "username"))

class StateObj<T>{
    private data: T

    constructor(value: T){
        this.data = value
    }

    get state() : T{
        return this.data
    }

    set state( value: T){
        this.data = value
    }


}

const Store = new StateObj<string>("Juan")
console.log(Store.state)
Store.state = "Juanito"
//Store.state = 12

const myState = new StateObj<(string | number | boolean)[]>(["adadad"])
myState.state = (["fafafafa", 42, true])

console.log(myState.state   )








