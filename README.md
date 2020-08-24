# ZoomExample
Adding zoom to an Image using Java

## Code (MainActivity):

You need to implement a SimpleOnScaleGestureListener and override onTouchEvent in your Activity.
```
    // Inner class to setup the scale factor to the image
    private class ZoomListener extends ScaleGestureDetector.SimpleOnScaleGestureListener{
    ....
    
    // Detecting touch event in view
    @Override
    public boolean onTouchEvent(MotionEvent event) {
    ....
```

## Final result:

<p align="center">
<img align="center" src="images/02.gif" width="300"> 
</p>
