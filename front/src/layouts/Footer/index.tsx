import './style.css';

//          component           //
//  description: 푸터 레이아웃 컴포넌트 //
export default function Footer() {
  //          state           //

  //          function            //

  //          event handler           //

  //          component           //

  //          effect            //

  //          render            //

  return (
    <div id='footer'>
      <div className='footer-top'>
        <div className='footer-top-left'>
          <div className='footer-logo-icon'></div>
          <div className='footer-logo-text'>Dori Board</div>
        </div>
        <div className='footer-top-right'>
          <div className='footer-email'>dori@email.com</div>
          <div className='footer-icon-button'>
            <div className='footer-insta-icon'></div>
          </div>
          <div className='footer-icon-button'>
            <div className='footer-blog-icon'></div>
          </div>
        </div>
      </div>
      <div className='footer-bottom'>
        Copyright ⓒ 2023 Dori. All Right Reserved.
      </div>
    </div>
  )
}

