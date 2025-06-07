// Classes


class Coder{
    /*
    name: string
    music : string
    age : number
    lang : string

    constructor(name: string, music: string, age: number, lang: string) {
        this.name = name
        this.music = music
        this.age = age
        this.lang = lang

    }
    */

    secondLang!: string 

    // it means i can for an example create the Object from this class with out instantiate the lang Attribute

    constructor(
        public readonly name: string,
        public music: string,
        private age: number,
        protected lang: string = 'Typesc') {

            this.name = name
            this.music = music
            this. age = age
            this.lang = lang
    }

    public getAge(){
        return `Hello, iam ${this.age}`
    }

}



const Test = new Coder('Juan', 'Rock', 32, 'Typesc')
console.log(Test.getAge())

// console.log(Test.age)
// console.log(Test.lang)

class WebDev extends Coder{

    constructor(
        public computer: string,
        name: string,
        music: string,
        age: number
    ){
        super(name, music, age)
        this.computer = computer
    }

    public getLang(){
        return `I write ${this.lang}`
        
    }



}

const Sara = new WebDev('Mac', 'Sara', 'Lofi', 23)
console.log(Sara.getLang())
console.log(Sara.getAge())


interface Musicians{
    name: string
    instrument: string
    play(action: string) : string

}

class Guitarist implements Musicians{
    name: string
    instrument: string

    constructor(name: string, instrument: string) {
        this.name = name
        this.instrument = instrument
    }

    play (action : string) {
        return `${this.name} ${action} the ${this.instrument}`
    }



}

const Page = new Guitarist('lala', 'guitar')
console.log(Page.play('strums'))

class Bands{

    private dataState: string[]

    constructor(ds: string[]){
        this.dataState = ds
    }

    public get getData() : string[] {
        return this.dataState
    }

    public set setData(value: string[]){
        if(Array.isArray(value) && value.every(el => typeof el === 'string')){
            this.dataState = value
            return
        }else throw new Error ('Param is not an array of strings')
    }


}

const MyBands = new Bands(['band 1', 'band 2'])
console.log(MyBands.getData)
MyBands.setData = [...MyBands.getData, 'band 3']
console.log(MyBands.getData)
MyBands.setData = ['change the data array']
console.log(MyBands.getData)







