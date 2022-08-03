//A data structure that represents a list. The list is made out of "nodes". Each node will have a value and a .next. The .next of a node will point to the address of the node "behind" it in "line"

// let nums = [4,5,7,9];
//idx          0 1 2 3

//metaphor: SLL === the line at chipotle
class SLL{
    constructor(){
        this.head = null;
    }

    isEmpty(){
        if(this.head === null){
            return true;
        }else{
            return false;
        }
    }

    insertAtFront(valueInput){
        //create a person/node with that valueInput
        let newPerson = new Node(valueInput);
        this.head = newPerson;
    }

    removeFromFront(){

    }

    display(){

    }

}

//metaphor: node === each person in chipotle line
class Node{
    constructor(valueInput){
        this.value = valueInput;
        this.next = null;
    }
}



let chipotleLine = new SLL();


console.log(chipotleLine.isEmpty());

chipotleLine.insertAtFront("David");
chipotleLine.insertAtFront("Mack");


