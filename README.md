# Agora Android Application

## Readme

Project to show my coding practices and UI Designs.

## [Video of working prototype](https://photos.app.goo.gl/o2fYLy1gJ4FkUw7K6)

Overview of the repository:

##  UI implementation as shown in the Mockups:
◘ I have used Relative and constraint layout so that the screens are perfect for screens of every size.

◘ Navigation graph and NavHostFragment to change the fragments following single Activity Architecture.

◘ MainTabFragment contains the bottomNavigation view which performs fragment transition between the Election, home, profile Fragment.

◘ Styles for Button, TextInputLayout and splash screen.

◘ Custom Selectors and drawables for Buttons.

◘ LayerList for splash Screen.

◘ Binding views of the recycler view item with the dummy data generated in the repository class.

◘ Generic names for the resource values and views.

◘ Using vector drawables for icons(no images).


##  Code:
◘ Complete code in kotlin following proper MVVM and Single Activity Architecture.

◘ Configured all fragments with navigation architecture components.

◘ Configured all modules with dagger dagger, Created AppModule, AppComponent, ViewModelModule, FragmentModule, ViewModelFactory, fragment factory.

◘ Use of Kotlin coroutines to access data from the repository class in the background thread.

◘ Use of extension function to change title of the action bar, color of status bar and access string resources with simple functions.

◘ API integration for LOGIN API and Configuring room database to store user information.(To show project structure after implementation of room database and retrofit)

◘ Use of live data to observe if the user is logged in or not.

◘ Creation of custom exceptions to handle API and network call exceptions

◘ Configured Groupie and implemented data binding in the election fragment. I have used groupie to reduce boilerplate code for the recycler view holder.



## Design

[Figma Prototype](https://www.figma.com/proto/meXzMM589jPlRaXJgKKeBm/Agora-Android-Copy?node-id=69%3A0&viewport=1541%2C-116%2C0.3036155700683594&scaling=scale-down)

Note: Open link on laptop for smooth action.

<table>
   <tr>
     <td><kbd><img src="./mockups/Screen1.png"></kbd></td>
     <td><kbd><img src="./mockups/Screen2.png"></kbd></td>
     <tr> 
     <td><kbd><img src="./mockups/Screen3.png"></kbd></td>
     <td><kbd><img src="./mockups/Screen4.png"></kbd></td>
    </tr>
    <tr>
     <td><kbd><img src="./mockups/Screen5.png"></kbd></td>
     <td><kbd><img src="./mockups/Screen6.png"></kbd></td>
     <tr> 
     <td><kbd><img src="./mockups/Screen7.png"></kbd></td>
     <td><kbd><img src="./mockups/Screen8.png"></kbd></td>
    </tr>
   <tr>
     <td><kbd><img src="./mockups/Screen9.png"></kbd></td>
     <td><kbd><img src="./mockups/Screen10.png"></kbd></td>
    <tr> 
     <td><kbd><img src="./mockups/Screen11.png"></kbd></td>
     <td><kbd><img src="./mockups/Screen12.png"></kbd></td>
    </tr>
    <tr>
     <td><kbd><img src="./mockups/Screen13.png"></kbd></td>
     <td><kbd><img src="./mockups/Screen14.png"></kbd></td>
     <tr> 
     <td><kbd><img src="./mockups/Screen15.png"></kbd></td>
     <td><kbd><img src="./mockups/Screen16.png"></kbd></td>
    </tr>
    <tr>
     <td><kbd><img src="./mockups/Screen17.png"></kbd></td>
     <td><kbd><img src="./mockups/Screen18.png"></kbd></td>
     <tr> 
     <td><kbd><img src="./mockups/Screen19.png"></kbd></td>
     <td><kbd><img src="./mockups/Screen20.png"></kbd></td>
    </tr>
    <tr>
         <td><kbd><img src="./mockups/Screen21.png"></kbd></td>
         <td><kbd><img src="./mockups/Screen22.png"></kbd></td>
         <tr> 
         <td><kbd><img src="./mockups/Screen23.png"></kbd></td>
     </tr>
    
</table>



