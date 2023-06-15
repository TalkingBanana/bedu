export default {
  getEmail: state => state.email,
  getNickname: state => state.nickname,
  getErrorState: state => state.errorState,
  getIsAuth: state => state.isAuth,
  loggedIn(state) {
    return !!state.user
  },
  isLogin: state => state.isLogin,
}