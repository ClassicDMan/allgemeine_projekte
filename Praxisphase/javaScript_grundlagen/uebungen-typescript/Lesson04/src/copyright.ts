// Original in JS Code

/*

const year = document.getElementById("year")
const thisYear = new Date().getFullYear()

year.setAttribute("datetime", thisYear)
year.textContent = thisYear

*/




/*
// first varation:
let year: HTMLElement | null
year = document.getElementById("year")

let thisYear: string
thisYear = new Date().getFullYear().toString()

if(year){
    year.setAttribute("datetime", thisYear)
    year.textContent = thisYear

}

*/



// second variation:
const year: HTMLElement | null = document.getElementById("year") as HTMLSpanElement

const thisYear: string = new Date().getFullYear().toString()

if(year){
    year.setAttribute("datetime", thisYear)
    year.textContent = thisYear

}







