export default class Queue{
    
    #data // Vetor print -> Só pode ser acessado dentro da classe 

    constructor(){
        this.#data = [] 
    }

    // método de inserção na fila 

    enqueue(val){
        this.#data.push(val)
    }

    //método de remoção na fila 

    dequeue(){
        this.#data.shift()  // -> Remove o primeiro na fila 
    }

    peek(){
        return this.#data[0]
    }

     get isEmpty(){
        return this.#data.length === 0
    }

    print(){
        let output = '[ '
        for(let i = 0; i < this.#data.length; i++){
            if(output !== "[ "){
                output += ", "
            } 
            output += `(${i}): ${this.#data[i]}`
        }
        return output + " ]"
    }
}