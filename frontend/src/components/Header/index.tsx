import logo from "../../assets/img/logo.svg";

import './styles.css';

function Header() {
  return (
    <header>
      <div className="logo-container">
        <img src={logo} alt="DSMeta" />
        <h1>DSMeta</h1>
        <p>
          Desenvolvido por João Paulo dos Santos segue no
          <a href="https://www.facebook.com/joaopaulo.dossantos.121772">
            Facebook
          </a>
        </p>
      </div>
    </header>
  );
}
export default Header;
