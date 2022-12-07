/*const modal = document.getElementById('modal');
const btnModal = document.getElementById('btn');

btnModal.addEventListener('click', () => {

    modal.classList.add('show-modal')
});

window.addEventListener('click', (e) => {
  e.target === modal ? modal.classList.remove('show-modal') : false
//modal.classList.add('out')
})
*/

var $button         = $('.btn_modal'),
    $modalContainer = $('#modal'),
    $body           = $('body');

$button.on('click', function () {
  btnId = $(this).attr('id');
  
  $modalContainer
      .removeAttr('class')
      .addClass('show-modal');
  $content
      .removeAttr('class')
      .addClass('content');
  
  $body.addClass('modal-active');  
});

$modalContainer.on('click', function () {
  $(this).addClass('out');
  $body.removeClass('modal-active');
  if ($(this).hasClass('show-modal')) {
    
    $content.addClass('out');
    
  }
});