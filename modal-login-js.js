$(document).ready(function() {
    var placeholderTarget = $('.textbox input[type="text"], .textbox input[type="password"]');

    placeholderTarget.on('focus', function(){
        $(this).siblings('label').fadeOut('fast');
    });

    placeholderTarget.on('focus', function(){
        if($(this).val() == ''){
            $(this).siblings('label').fadeOut('fast');
        }
    });
});

const modal = document.getElementsByClassName('modal');

open.addEventListener('click', () => {
  modal.classList.add('show-modal')
})

close.addEventListener('click', () => {
    modal.classList.add('show-modal')
})

window.addEventListener('click', (e) => {
    e.target === modal ? modal.classList.remove('show-modal') : false
})

function go_reg(){
    const sel = document.getElementsByClassName('modal_login')[0];
    const sel2 = document.getElementsByClassName('modal_Wrap')[0];

    sel.style.display = "none";
    set2.style.display = "block";
}