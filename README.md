# SpicyAnimation
[![](https://jitpack.io/v/tahajadid/SpicyAnimation.svg)](https://jitpack.io/#tahajadid/SpicyAnimation)

## Overview
In some application, we need to get someone's attention, and not just by the view's position we make a sense, may we need to add color to blink a view or make some animation on it


## Setup
Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Add the dependency

```groovy
dependencies {
	implementation 'com.github.tahajadid:SpicyAnimation:Tag'
}
```

## Demo

<img src="/demo.gif" width="230" height="500"/>

## How to use it

### Blibk a view

One time Blink
```groovy
SpicyAnimation().blinkView(
        blinkOneButton,
	800,
        Color.parseColor("#c85a54")
	Color.parseColor("#ff8a80")
)
```

Infinit Blink
```groovy
SpicyAnimation().blinkViewInfinite(
        infiniteButton,
	400,
        Color.parseColor("#c85a54")
	Color.parseColor("#ff8a80")
)
```

### Fade a view

Fade to Down & Right
```groovy
SpicyAnimation().fadeToDown(fadeDownButton, 50F, 1000)
SpicyAnimation().fadeToRight(fadeRightButton, 50F, 3000)
```

You can use other stuff by building this project and discovering the 
[sample](https://github.com/tahajadid/SpicyAnimation/tree/develop/app)

### Rotate a view

Fade to Down & Right
```groovy
SpicyAnimation().rectangularRoad(rectangularRotationOne, 100F, 500, false) // true if you want a fade in animation start/end
```


## Licence

[LICENCE](https://github.com/tahajadid/SpicyAnimation/blob/develop/LICENSE)
