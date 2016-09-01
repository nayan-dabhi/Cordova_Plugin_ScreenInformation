# Cordova Screen Information Plugin

This cordova plugin is usefull to get device screen information.

## Installation

```
cordova plugin add https://github.com/nayan-dabhi/cordova_plugin_screeninformation
```

## Supported Platforms

![Platforms](https://img.shields.io/badge/platform-android-green.svg?style=flat-square)


## Usage

```js
ScreenInformation.getInformation(function(data){
  console.log(data);
}, function(){
  console.log("Unable to get device screen information....");
});
```

The plugin return a screen information JSON object.

Return values:

* `density_point` - Number (screen density dpi point)
* `density_name` - Number (screen density dpi name)
* `width` - Number (screen width in pixels)
* `height` - Number (screen width in pixels)
* `xdpi` - Number (pixels per inch of the screen in the X axis)
* `ydpi` - Number (pixels per inch of the screen in the Y axis)

## References

- https://developer.android.com/guide/practices/screens_support.html
- http://stackoverflow.com/questions/3166501/getting-the-screen-density-programmatically-in-android
