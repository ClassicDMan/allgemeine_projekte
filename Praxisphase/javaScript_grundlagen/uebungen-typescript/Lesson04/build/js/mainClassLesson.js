"use strict";
// Classes
class Coder {
    // it means i can for an example create the Object from this class with out inistantiate the lang Attribute
    constructor(name, music, age, lang = 'Typesc') {
        this.name = name;
        this.music = music;
        this.age = age;
        this.lang = lang;
        this.name = name;
        this.music = music;
        this.age = age;
        this.lang = lang;
    }
    getAge() {
        return `Hello, iam ${this.age}`;
    }
}
const Test = new Coder('Juan', 'Rock', 32, 'Typesc');
console.log(Test.getAge());
// console.log(Test.age)
// console.log(Test.lang)
class WebDev extends Coder {
    constructor(computer, name, music, age) {
        super(name, music, age);
        this.computer = computer;
        this.computer = computer;
    }
    getLang() {
        return `I write ${this.lang}`;
    }
}
const Sara = new WebDev('Mac', 'Sara', 'Lofi', 23);
console.log(Sara.getLang());
console.log(Sara.getAge());
class Guitarist {
    constructor(name, instrument) {
        this.name = name;
        this.instrument = instrument;
    }
    play(action) {
        return `${this.name} ${action} the ${this.instrument}`;
    }
}
const Page = new Guitarist('lala', 'guitar');
console.log(Page.play('strums'));
class Bands {
    constructor(ds) {
        this.dataState = ds;
    }
    get getData() {
        return this.dataState;
    }
    set setData(value) {
        if (Array.isArray(value) && value.every(el => typeof el === 'string')) {
            this.dataState = value;
            return;
        }
        else
            throw new Error('Param is not an array of strings');
    }
}
const MyBands = new Bands(['band 1', 'band 2']);
console.log(MyBands.getData);
MyBands.setData = [...MyBands.getData, 'band 3'];
console.log(MyBands.getData);
MyBands.setData = ['change the data array'];
console.log(MyBands.getData);
