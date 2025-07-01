document.addEventListener('DOMContentLoaded', function () {
    const aboutSection = document.getElementById('about-section');
    if (aboutSection) {
        setTimeout(() => {
            aboutSection.classList.add('show');
        }, 100);
    }
    const cardImg = document.getElementById('cardImg');
     if (cardImg) {
        setTimeout(() => {
            cardImg.classList.add('display');
        }, 100);
    }
    const cardImg1 = document.getElementById('cardImg1');
    if (cardImg1) {
        setTimeout(() => {
            cardImg1.classList.add('display1');
        }, 100);
    }

});