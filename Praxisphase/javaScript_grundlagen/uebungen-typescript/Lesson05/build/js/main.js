"use strict";
// index signatures
/*
interface TransactionObj {
    readonly [index: string] : number
}
*/
const todayTransaction = {
    pizza: -10,
    Books: -5,
    Job: 50,
};
console.log(todayTransaction.pizza);
console.log(todayTransaction['pizza']);
let prop = 'pizza';
console.log(todayTransaction[prop]);
const todayNet = (transactions) => {
    let total = 0;
    for (const transaction in transactions) {
        total += transactions[transaction];
    }
    return total;
};
console.log(todayNet(todayTransaction));
const student = {
    name: "adadad",
    gpa: 3.4,
    classes: [100, 200]
};
// console.log(student.test)
/*
for(const key in student) {
    console.log(`${key}: ${student[key as keyof Student]}`)
}
*/
Object.keys(student).map(key => {
    console.log(student[key]);
});
const logStudentKey = (student, key) => {
    console.log(`Student ${key}: ${student[key]}`);
};
logStudentKey(student, 'gpa');
const monthlyIncomes = {
    salary: 500,
    bonus: 100,
    sidehustle: 250
};
for (const revenue in monthlyIncomes) {
    console.log(monthlyIncomes[revenue]);
}
