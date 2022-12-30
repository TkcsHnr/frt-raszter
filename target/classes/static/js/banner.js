$(window).scroll(function() {
    var scroll = $(window).scrollTop();
      $(".banner").css({
          transform: 'translateY('+(-1*scroll/3.5)+'px)',
          filter: 'grayscale('+((100 + scroll/2.5)/100 - 1)+')'
      });
  });