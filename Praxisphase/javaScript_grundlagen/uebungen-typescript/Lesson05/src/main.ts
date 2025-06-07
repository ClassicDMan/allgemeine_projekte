// index signatures
/*
interface TransactionObj {
    readonly [index: string] : number
}
*/



interface TransactionObj{
    readonly [index: string] : number
    pizza: number,
    Books: number,
    Job: number

}

const todayTransaction: TransactionObj = {
    pizza: -10,
    Books: -5,
    Job: 50,

}

console.log(todayTransaction.pizza)
console.log(todayTransaction['pizza'])

let prop : string = 'pizza'
console.log(todayTransaction[prop])


const todayNet = (transactions : TransactionObj): number => {
    let total = 0
    for(const transaction in transactions){
        total += transactions[transaction]

    }
    return total
}
console.log(todayNet(todayTransaction))

// todayTransaction.pizza = 40

//console.log(todayTransaction['Dave'])

interface Student{
    // [key : string]: string | number | number[] | undefined
    name: string,
    gpa: number,
    classes?: number[]
}

const student : Student = {
    name: "adadad",
    gpa: 3.4 ,
    classes: [100, 200]

}

// console.log(student.test)
/*
for(const key in student) {
    console.log(`${key}: ${student[key as keyof Student]}`)
}
*/

Object.keys(student).map(key => {
    console.log(student[key as keyof typeof student])
})

const logStudentKey = (student : Student, key: keyof Student): void => {
    console.log(`Student ${key}: ${student[key]}`)
}

logStudentKey(student, 'gpa')


////////////////////////////////////////////////////////

//interface Incomes{
//    [key: string]: number
//}

type Streams = 'salary' | 'bonus' | 'sidehustle'

type Incomes = Record<Streams, number | string>

const monthlyIncomes: Incomes = {
    salary: 500,
    bonus: 100,
    sidehustle: 250

}

for(const revenue in monthlyIncomes){
    console.log(monthlyIncomes[revenue as keyof Incomes])
}



