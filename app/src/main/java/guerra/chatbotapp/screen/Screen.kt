package guerra.chatbotapp.screen

sealed class Screen(val route:String){
    object LoginScreen:Screen("loginScreen")
    object SignupScreen:Screen("signUpScreen")
    object ChatRoomsScreen:Screen("chatRoomScreen")
    object ChatScreen:Screen("chatScreen")
}