"use strict";

const stateList = ['WAITING', 'PREPARING', 'FINISHED'];
let stateCurrent = 0;
let showBtn = document.getElementById("Show");
let nextBtn = document.getElementById("Next");
let listBtn = document.getElementById("List");

showBtn.addEventListener("click", () => {
    stateShow();
});

nextBtn.addEventListener("click", () => {
    nextState();
});

listBtn.addEventListener("click", () => {
    stateLShowList();
});

function nextState() {
    if (stateCurrent < 2) {
        stateCurrent += 1;
        console.log('state is changed form ' + stateList[stateCurrent - 1] + ' to ' + stateList[stateCurrent])
    } else {
        console.log('state is already in ' + stateList[stateCurrent] + ' state');
    }
}

function stateShow() {
    console.log(stateList[stateCurrent]);
}

function stateLShowList() {
    stateList.forEach(function (state) {
        console.log(state);
    });
}