
# ImageToast

[![Release]( https://jitpack.io/v/doomers/imagetoast.svg?style=flat )]( https://jitpack.io/#doomers/imagetoast )


## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	        compile 'com.github.doomers:imagetoast:2.0'
}
```

You have successfully integrated ImageToast in your android application

## How to display a Toast
        ImageToast.getInstance().makeText(this,bitmap);
### First create the bitmap of image resource you wan't to display

```
 Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.your_drawable_resource_name);
```

### Now to display the Toast

```
ImageToast.getInstance().makeText(this,bitmap);
```

## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/doomers/ImageToast/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed.




       



