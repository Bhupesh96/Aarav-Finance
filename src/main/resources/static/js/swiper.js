 var swiper = new Swiper(".slide-content", {
      slidesPerView: 1,
      spaceBetween: 25,
      slidesPerGroup: 1,
      loop: true,
      centerSlide: true,
      fade: true,
      grabCursor: true,
      pagination: {
        el: ".swiper-pagination",
        clickable: true,
        dynamicBullets: true,
      },
      navigation: {
        nextEl: ".swiper-button-next",
        prevEl: ".swiper-button-prev",
      },
      
      breakpoints:{
		  0: {
			  slidesPerView: 1,
			  slidesPerGroup: 1,
			  loop: true,
		  },
		  520: {
			  slidesPerView: 2,
			  slidesPerGroup: 2,
			  loop: true,
		  },
		  950: {
			  slidesPerView: 3,
			  slidesPerGroup: 3,
			  loop: true,
		  },
	  },
    });