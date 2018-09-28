# Rate Catz

A masterfully crafted Android application with the main intent of pitting two cats against each other in a randomized rating roulette.
Initially created for CS492: Mobile Software Development, Rate Catz contains the following:

1. Multiple activities
2. An implicit intent to launch an external app
3. HTTPS requests to a third-party API 
4. Activity lifecycle methods to ensure clarity and flow
5. Ability to store favorite cats in a database using SQLite
6. Polished and well-styled UI

## The Android Application

The main page features two cats. These cats can be cute and cuddly or viscious and ugly! The app even features gifs to show cats in action. Your challenge is to swipe to select your favorite. The app will continue to fetch random cat pictures for as long as you desire!

<p align="center">
  <img src="https://github.com/DrakeSeifert/RateCatz-Android-Application/blob/master/ScreenShots/ScreenShot1.jpg" alt="ScreenShot1" width="400"/>
</p>

---

But wait, there's more! There is a CATegory option in the settings menu that allows you to pick specific categories of cats; only pictures of cats related to the chosen CATegory will appear for you to swipe on.

<p align="center">
  <img src="https://github.com/DrakeSeifert/RateCatz-Android-Application/blob/master/ScreenShots/ScreenShot2.jpg" alt="ScreenShot1" width="400"/>
</p>

---

After choosing "sunglasses" from the CATegory menu, only cats with sunglasses will be available to swipe!

<p align="center">
  <img src="https://github.com/DrakeSeifert/RateCatz-Android-Application/blob/master/ScreenShots/ScreenShot3.jpg" alt="ScreenShot1" width="400"/>
</p>

---

If you ever come across cats you cannot live without, go ahead and double tap the photo to add it to your favorites! (You can even favorite both photos).

<p align="center">
  <img src="https://github.com/DrakeSeifert/RateCatz-Android-Application/blob/master/ScreenShots/ScreenShot4.jpg" alt="ScreenShot1" width="400"/>
</p>

---

To see what cats you have favorited, head on over to the favorites page. You can delete cats at any time by holding down the photo and selecting the delete option.

<p align="center">
  <img src="https://github.com/DrakeSeifert/RateCatz-Android-Application/blob/master/ScreenShots/ScreenShot5.jpg" alt="ScreenShot1" width="400"/>
</p>

---

You can also select the photo to get a "Kitty Cat Closeup"

<p align="center">
  <img src="https://github.com/DrakeSeifert/RateCatz-Android-Application/blob/master/ScreenShots/ScreenShot6.jpg" alt="ScreenShot1" width="400"/>
</p>

---

If you find a photo that your friends must see, easily grab a shareable the link by clicking the share icon from the Kitty Cat Closeup page!

<p align="center">
  <img src="https://github.com/DrakeSeifert/RateCatz-Android-Application/blob/master/ScreenShots/ScreenShot7.jpg" alt="ScreenShot1" width="400"/>
</p>

## The Cat API 

The [Cat API](http://thecatapi.com/ "The Cat API") allows cat loving developers to randomly select cats for their app.
It references a database with easy to write queries and will return a selection of random cat image links.
This API also has functionality to allow for favoriting and voting through other specific queries.

## Developers

* Drake Seifert (seifertd@oregonstate.edu)
	* Favorite Catz Activity
	* Favorite Catz Recycler View
	* PhotoView Activity
	* Sharing Feature With Implicit Intents
	* Database Management
* Nathan Shepherd (shephern@oregonstate.edu)
	* Swiping Animation
	* Favoriting Animation
	* CATegory Selection
	* Activity Lifecycle Methods
	* The Cat API Management
* Alea Weeks (weeksr@oregonstat.edu)
	* Main UI Display
	* The Cat API Management
	* Database Management
