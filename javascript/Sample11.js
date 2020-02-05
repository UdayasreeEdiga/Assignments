function* dummygenerator() {
    yield "x";
    yield "y";
    yield"z";
    return "a";
}

function temp() {
    console.log("Iam abc");
    stages=dummygenerator();
    shallContinue = true;

    while(shallContinue){
        currStage = stages.next();
        console.log(currStage.value);
        console.log("I am temp function");        
        shallContinue = !currStage.done;
    }
    
}
temp();
