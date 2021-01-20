/* 
 *  @author Ousseynou
 */

var mySwiper = new Swiper('.swiper-container', {

    effect: 'coverflow',
    slidesPerView: 3,
    loop:true,
    slidesPerColumn:1,
    coverflowEffect: {
        rotate: 30,
        slideShadows: false
    },    
    breakpoints: {
          // when window width is >= 320px
          320: {
            slidesPerView: 3,
            spaceBetween: 10,
            slidesPerColumn:1
          },
          // when window width is >= 480px
          480: {
            slidesPerView: 2,
            spaceBetween: 10,
            slidesPerColumn:1
          },
          // when window width is >= 640px
          640: {
            slidesPerView: 3,
            spaceBetween: 10,
            slidesPerColumn:1
          }
 
    }
});



 
mySwiper.init();