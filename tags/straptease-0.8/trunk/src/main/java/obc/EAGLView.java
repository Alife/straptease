package obc;

import straptease.EAGLViewDelegate;

@SuppressWarnings("all")
public class EAGLView
    extends UIResponder
{
	public static class Straptease {
	    static long handle_ = joc.Runtime.dlopen("/usr/lib/jni/libstraptease.jnilib");

	    public Straptease() {
	    }
	}

    private static Object framework_ = new Straptease();

    //EAGLView
    
///    - (void) drawView;
    boolean needDelegate=true;
	@joc.Message(name = "drawView", types = "v8@0:4")
	public final void drawView() {
		if (needDelegate) {
			joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setDelegate:", new EAGLViewDelegate());
			needDelegate = false;
		}
		joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "drawView");
	}

    public void setupGL(){
    	
    }
    
    public void renderGL(){
    	
    }
    
    //UIView
    /**
     * + (char) _invalidatesViewUponCreation 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_invalidatesViewUponCreation", types="c8@0:4")
    public static byte $_invalidatesViewUponCreation() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "_invalidatesViewUponCreation");
    }

    /**
     * + (char) _pendingAnimations 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_pendingAnimations", types="c8@0:4")
    public static byte $_pendingAnimations() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "_pendingAnimations");
    }

    /**
     * + (void) _setInvalidatesViewUponCreation:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_setInvalidatesViewUponCreation:", types="v12@0:4c8")
    public static void $_setInvalidatesViewUponCreation$(byte arg0) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "_setInvalidatesViewUponCreation:", arg0);
    }

    /**
     * + (void) _setIsResponderAncestorOfFirstResponder:(char)arg0 startingAtFirstResponder:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_setIsResponderAncestorOfFirstResponder:startingAtFirstResponder:", types="v16@0:4c8@12")
    public static void $_setIsResponderAncestorOfFirstResponder$startingAtFirstResponder$(byte arg0, Object arg1) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "_setIsResponderAncestorOfFirstResponder:startingAtFirstResponder:", arg0, arg1);
    }

    /**
     * + (char) areAnimationsEnabled 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="areAnimationsEnabled", types="c8@0:4")
    public static byte $areAnimationsEnabled() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "areAnimationsEnabled");
    }

    /**
     * + (void) beginAnimations:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="beginAnimations:", types="v12@0:4@8")
    public static void $beginAnimations$(Object arg0) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "beginAnimations:", arg0);
    }

    /**
     * + (void) beginAnimations:(id)arg0 context:(void *)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="beginAnimations:context:", types="v16@0:4@8^v12")
    public static void $beginAnimations$context$(Object arg0, joc.Pointer<?> arg1) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "beginAnimations:context:", arg0, arg1);
    }

    /**
     * + (void) commitAnimations 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="commitAnimations", types="v8@0:4")
    public static void $commitAnimations() {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "commitAnimations");
    }

    /**
     * + (void) disableAnimation 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="disableAnimation", types="v8@0:4")
    public static void $disableAnimation() {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "disableAnimation");
    }

    /**
     * + (void) enableAnimation 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="enableAnimation", types="v8@0:4")
    public static void $enableAnimation() {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "enableAnimation");
    }

    /**
     * + (void) endAnimations 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="endAnimations", types="v8@0:4")
    public static void $endAnimations() {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "endAnimations");
    }

    /**
     * + (void) flush 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="flush", types="v8@0:4")
    public static void $flush() {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "flush");
    }

    /**
     * + (Class) layerClass 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="layerClass", types="#8@0:4")
    public static Class $layerClass() {
        return (Class) joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "layerClass");
    }

    /**
     * + (void) setAnimationAutoreverses:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setAnimationAutoreverses:", types="v12@0:4c8")
    public static void $setAnimationAutoreverses$(byte arg0) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "setAnimationAutoreverses:", arg0);
    }

    /**
     * + (void) setAnimationBeginsFromCurrentState:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setAnimationBeginsFromCurrentState:", types="v12@0:4c8")
    public static void $setAnimationBeginsFromCurrentState$(byte arg0) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "setAnimationBeginsFromCurrentState:", arg0);
    }

    /**
     * + (void) setAnimationCurve:(int)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setAnimationCurve:", types="v12@0:4i8")
    public static void $setAnimationCurve$(int arg0) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "setAnimationCurve:", arg0);
    }

    /**
     * + (void) setAnimationDelay:(double)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setAnimationDelay:", types="v16@0:4d8")
    public static void $setAnimationDelay$(double arg0) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "setAnimationDelay:", arg0);
    }

    /**
     * + (void) setAnimationDelegate:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setAnimationDelegate:", types="v12@0:4@8")
    public static void $setAnimationDelegate$(Object arg0) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "setAnimationDelegate:", arg0);
    }

    /**
     * + (void) setAnimationDidStopSelector:(SEL)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setAnimationDidStopSelector:", types="v12@0:4:8")
    public static void $setAnimationDidStopSelector$(joc.Selector arg0) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "setAnimationDidStopSelector:", arg0);
    }

    /**
     * + (void) setAnimationDuration:(double)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setAnimationDuration:", types="v16@0:4d8")
    public static void $setAnimationDuration$(double arg0) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "setAnimationDuration:", arg0);
    }

    /**
     * + (void) setAnimationFrameInterval:(double)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setAnimationFrameInterval:", types="v16@0:4d8")
    public static void $setAnimationFrameInterval$(double arg0) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "setAnimationFrameInterval:", arg0);
    }

    /**
     * + (void) setAnimationFromCurrentState:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setAnimationFromCurrentState:", types="v12@0:4c8")
    public static void $setAnimationFromCurrentState$(byte arg0) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "setAnimationFromCurrentState:", arg0);
    }

    /**
     * + (void) setAnimationPosition:(struct CGPoint)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setAnimationPosition:", types="v16@0:4{CGPoint=ff}8")
    public static void $setAnimationPosition$(CGPoint arg0) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "setAnimationPosition:", arg0);
    }

    /**
     * + (void) setAnimationRepeatAutoreverses:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setAnimationRepeatAutoreverses:", types="v12@0:4c8")
    public static void $setAnimationRepeatAutoreverses$(byte arg0) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "setAnimationRepeatAutoreverses:", arg0);
    }

    /**
     * + (void) setAnimationRepeatCount:(float)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setAnimationRepeatCount:", types="v12@0:4f8")
    public static void $setAnimationRepeatCount$(float arg0) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "setAnimationRepeatCount:", arg0);
    }

    /**
     * + (void) setAnimationRoundsToInteger:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setAnimationRoundsToInteger:", types="v12@0:4c8")
    public static void $setAnimationRoundsToInteger$(byte arg0) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "setAnimationRoundsToInteger:", arg0);
    }

    /**
     * + (void) setAnimationStartDate:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setAnimationStartDate:", types="v12@0:4@8")
    public static void $setAnimationStartDate$(Object arg0) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "setAnimationStartDate:", arg0);
    }

    /**
     * + (void) setAnimationStartTime:(double)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setAnimationStartTime:", types="v16@0:4d8")
    public static void $setAnimationStartTime$(double arg0) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "setAnimationStartTime:", arg0);
    }

    /**
     * + (void) setAnimationTransition:(int)arg0 forView:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setAnimationTransition:forView:", types="v16@0:4i8@12")
    public static void $setAnimationTransition$forView$(int arg0, Object arg1) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "setAnimationTransition:forView:", arg0, arg1);
    }

    /**
     * + (void) setAnimationTransition:(int)arg0 forView:(id)arg1 cache:(char)arg2 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setAnimationTransition:forView:cache:", types="v20@0:4i8@12c16")
    public static void $setAnimationTransition$forView$cache$(int arg0, Object arg1, byte arg2) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "setAnimationTransition:forView:cache:", arg0, arg1, arg2);
    }

    /**
     * + (void) setAnimationWillStartSelector:(SEL)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setAnimationWillStartSelector:", types="v12@0:4:8")
    public static void $setAnimationWillStartSelector$(joc.Selector arg0) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "setAnimationWillStartSelector:", arg0);
    }

    /**
     * + (void) setAnimationsEnabled:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setAnimationsEnabled:", types="v12@0:4c8")
    public static void $setAnimationsEnabled$(byte arg0) {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "setAnimationsEnabled:", arg0);
    }

    /**
     * + (void) throttledFlush 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="throttledFlush", types="v8@0:4")
    public static void $throttledFlush() {
        joc.Runtime.msgSend(EAGLView.class, EAGLView.class, "throttledFlush");
    }

    /**
     * - (void) _addSubview:(id)arg0 positioned:(int)arg1 relativeTo:(id)arg2 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_addSubview:positioned:relativeTo:", types="v20@0:4@8i12@16")
    public void _addSubview$positioned$relativeTo$(Object arg0, int arg1, Object arg2) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_addSubview:positioned:relativeTo:", arg0, arg1, arg2);
    }

    /**
     * - (char) _alwaysHandleInteractionEvents 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_alwaysHandleInteractionEvents", types="c8@0:4")
    public byte _alwaysHandleInteractionEvents() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_alwaysHandleInteractionEvents");
    }

    /**
     * - (char) _alwaysHandleScrollerMouseEvent 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_alwaysHandleScrollerMouseEvent", types="c8@0:4")
    public byte _alwaysHandleScrollerMouseEvent() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_alwaysHandleScrollerMouseEvent");
    }

    /**
     * - (void) _animateToScrollPoint:(struct CGPoint)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_animateToScrollPoint:", types="v16@0:4{CGPoint=ff}8")
    public void _animateToScrollPoint$(CGPoint arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_animateToScrollPoint:", arg0);
    }

    /**
     * - (void) _animateZoomFailureToWindowPoint:(struct CGPoint)arg0 scale:(float)arg1 duration:(float)arg2 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_animateZoomFailureToWindowPoint:scale:duration:", types="v24@0:4{CGPoint=ff}8f16f20")
    public void _animateZoomFailureToWindowPoint$scale$duration$(CGPoint arg0, float arg1, float arg2) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_animateZoomFailureToWindowPoint:scale:duration:", arg0, arg1, arg2);
    }

    /**
     * - (struct CGColor *) _backgroundCGColor 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_backgroundCGColor", types="^{CGColor=}8@0:4")
    public joc.Pointer<CGColor> _backgroundCGColor() {
        return (joc.Pointer<CGColor>) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_backgroundCGColor");
    }

    /**
     * - (char) _becomeFirstResponderWhenPossible 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_becomeFirstResponderWhenPossible", types="c8@0:4")
    public byte _becomeFirstResponderWhenPossible() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_becomeFirstResponderWhenPossible");
    }

    /**
     * - (char) _canDrawContent 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_canDrawContent", types="c8@0:4")
    public byte _canDrawContent() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_canDrawContent");
    }

    /**
     * - (char) _canHandleStatusBarMouseEvents:(struct __GSEvent *)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_canHandleStatusBarMouseEvents:", types="c12@0:4^{__GSEvent=}8")
    public byte _canHandleStatusBarMouseEvents$(joc.Pointer<__GSEvent> arg0) {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_canHandleStatusBarMouseEvents:", arg0);
    }

    /**
     * - (char) _canStartRotationFromEvent:(struct __GSEvent *)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_canStartRotationFromEvent:", types="c12@0:4^{__GSEvent=}8")
    public byte _canStartRotationFromEvent$(joc.Pointer<__GSEvent> arg0) {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_canStartRotationFromEvent:", arg0);
    }

    /**
     * - (char) _canStartZoomFromEvent:(struct __GSEvent *)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_canStartZoomFromEvent:", types="c12@0:4^{__GSEvent=}8")
    public byte _canStartZoomFromEvent$(joc.Pointer<__GSEvent> arg0) {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_canStartZoomFromEvent:", arg0);
    }

    /**
     * - (char) _cancelTapDelegateTracking 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_cancelTapDelegateTracking", types="c8@0:4")
    public byte _cancelTapDelegateTracking() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_cancelTapDelegateTracking");
    }

    /**
     * - (void) _clearBecomeFirstResponderWhenCapable 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_clearBecomeFirstResponderWhenCapable", types="v8@0:4")
    public void _clearBecomeFirstResponderWhenCapable() {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_clearBecomeFirstResponderWhenCapable");
    }

    /**
     * - (struct CGPoint) _constrainedScrollPoint:(struct CGPoint)arg0 contentSize:(struct CGSize)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_constrainedScrollPoint:contentSize:", types="{CGPoint=ff}24@0:4{CGPoint=ff}8{CGSize=ff}16")
    public CGPoint _constrainedScrollPoint$contentSize$(CGPoint arg0, CGSize arg1) {
        return (CGPoint) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_constrainedScrollPoint:contentSize:", arg0, arg1);
    }

    /**
     * - (char) _containedInAbsoluteResponderChain 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_containedInAbsoluteResponderChain", types="c8@0:4")
    public byte _containedInAbsoluteResponderChain() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_containedInAbsoluteResponderChain");
    }

    /**
     * - (void) _createLayerWithFrame:(struct CGRect)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_createLayerWithFrame:", types="v24@0:4{CGRect={CGPoint=ff}{CGSize=ff}}8")
    public void _createLayerWithFrame$(CGRect arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_createLayerWithFrame:", arg0);
    }

    /**
     * - (void) _didMoveFromWindow:(id)arg0 toWindow:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_didMoveFromWindow:toWindow:", types="v16@0:4@8@12")
    public void _didMoveFromWindow$toWindow$(Object arg0, Object arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_didMoveFromWindow:toWindow:", arg0, arg1);
    }

    /**
     * - (void) _didScroll 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_didScroll", types="v8@0:4")
    public void _didScroll() {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_didScroll");
    }

    /**
     * - (char) _doesViewControllerExistForAncestorOfView:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_doesViewControllerExistForAncestorOfView:", types="c12@0:4@8")
    public byte _doesViewControllerExistForAncestorOfView$(Object arg0) {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_doesViewControllerExistForAncestorOfView:", arg0);
    }

    /**
     * - (void) _enableLayerKitPatternDrawing:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_enableLayerKitPatternDrawing:", types="v12@0:4c8")
    public void _enableLayerKitPatternDrawing$(byte arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_enableLayerKitPatternDrawing:", arg0);
    }

    /**
     * - (id) _findFirstSubviewWantingToBecomeFirstResponder 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_findFirstSubviewWantingToBecomeFirstResponder", types="@8@0:4")
    public Object _findFirstSubviewWantingToBecomeFirstResponder() {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_findFirstSubviewWantingToBecomeFirstResponder");
    }

    /**
     * - (void) _gestureChanged:(int)arg0 event:(struct __GSEvent *)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_gestureChanged:event:", types="v16@0:4i8^{__GSEvent=}12")
    public void _gestureChanged$event$(int arg0, joc.Pointer<__GSEvent> arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_gestureChanged:event:", arg0, arg1);
    }

    /**
     * - (void) _gestureEnded:(struct __GSEvent *)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_gestureEnded:", types="v12@0:4^{__GSEvent=}8")
    public void _gestureEnded$(joc.Pointer<__GSEvent> arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_gestureEnded:", arg0);
    }

    /**
     * - (id) _gestureInfo 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_gestureInfo", types="@8@0:4")
    public Object _gestureInfo() {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_gestureInfo");
    }

    /**
     * - (id) _interceptEvent:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_interceptEvent:", types="@12@0:4@8")
    public Object _interceptEvent$(Object arg0) {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_interceptEvent:", arg0);
    }

    /**
     * - (id) _interceptMouseEvent:(struct __GSEvent *)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_interceptMouseEvent:", types="@12@0:4^{__GSEvent=}8")
    public Object _interceptMouseEvent$(joc.Pointer<__GSEvent> arg0) {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_interceptMouseEvent:", arg0);
    }

    /**
     * - (float) _internalScaleForScale:(float)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_internalScaleForScale:", types="f12@0:4f8")
    public float _internalScaleForScale$(float arg0) {
        return (float) (java.lang.Float) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_internalScaleForScale:", arg0);
    }

    /**
     * - (void) _invalidateLayerContents 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_invalidateLayerContents", types="v8@0:4")
    public void _invalidateLayerContents() {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_invalidateLayerContents");
    }

    /**
     * - (void) _invalidateSubviewCache 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_invalidateSubviewCache", types="v8@0:4")
    public void _invalidateSubviewCache() {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_invalidateSubviewCache");
    }

    /**
     * - (char) _isAncestorOfFirstResponder 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_isAncestorOfFirstResponder", types="c8@0:4")
    public byte _isAncestorOfFirstResponder() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_isAncestorOfFirstResponder");
    }

    /**
     * - (char) _isInAWindow 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_isInAWindow", types="c8@0:4")
    public byte _isInAWindow() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_isInAWindow");
    }

    /**
     * - (char) _isRubberBanding 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_isRubberBanding", types="c8@0:4")
    public byte _isRubberBanding() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_isRubberBanding");
    }

    /**
     * - (id) _layer 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_layer", types="@8@0:4")
    public Object _layer() {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_layer");
    }

    /**
     * - (void) _layoutSublayersOfLayer:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_layoutSublayersOfLayer:", types="v12@0:4@8")
    public void _layoutSublayersOfLayer$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_layoutSublayersOfLayer:", arg0);
    }

    /**
     * - (void) _makeSubtreePerformSelector:(SEL)arg0 withObject:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_makeSubtreePerformSelector:withObject:", types="v16@0:4:8@12")
    public void _makeSubtreePerformSelector$withObject$(joc.Selector arg0, Object arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_makeSubtreePerformSelector:withObject:", arg0, arg1);
    }

    /**
     * - (void) _makeSubtreePerformSelector:(SEL)arg0 withObject:(id)arg1 withObject:(id)arg2 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_makeSubtreePerformSelector:withObject:withObject:", types="v20@0:4:8@12@16")
    public void _makeSubtreePerformSelector$withObject$withObject$(joc.Selector arg0, Object arg1, Object arg2) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_makeSubtreePerformSelector:withObject:withObject:", arg0, arg1, arg2);
    }

    /**
     * - (void) _mouseDown:(struct __GSEvent *)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_mouseDown:", types="v12@0:4^{__GSEvent=}8")
    public void _mouseDown$(joc.Pointer<__GSEvent> arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_mouseDown:", arg0);
    }

    /**
     * - (void) _mouseDragged:(struct __GSEvent *)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_mouseDragged:", types="v12@0:4^{__GSEvent=}8")
    public void _mouseDragged$(joc.Pointer<__GSEvent> arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_mouseDragged:", arg0);
    }

    /**
     * - (void) _mouseUp:(struct __GSEvent *)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_mouseUp:", types="v12@0:4^{__GSEvent=}8")
    public void _mouseUp$(joc.Pointer<__GSEvent> arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_mouseUp:", arg0);
    }

    /**
     * - (void) _movedToFront 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_movedToFront", types="v8@0:4")
    public void _movedToFront() {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_movedToFront");
    }

    /**
     * - (void) _populateArchivedSubviews:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_populateArchivedSubviews:", types="v12@0:4@8")
    public void _populateArchivedSubviews$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_populateArchivedSubviews:", arg0);
    }

    /**
     * - (void) _postMovedFromSuperview:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_postMovedFromSuperview:", types="v12@0:4@8")
    public void _postMovedFromSuperview$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_postMovedFromSuperview:", arg0);
    }

    /**
     * - (void) _promoteDescendantToFirstResponderIfNecessary 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_promoteDescendantToFirstResponderIfNecessary", types="v8@0:4")
    public void _promoteDescendantToFirstResponderIfNecessary() {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_promoteDescendantToFirstResponderIfNecessary");
    }

    /**
     * - (void) _renderSnapshotWithRect:(struct CGRect)arg0 inContext:(struct CGContext *)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_renderSnapshotWithRect:inContext:", types="v28@0:4{CGRect={CGPoint=ff}{CGSize=ff}}8^{CGContext=}24")
    public void _renderSnapshotWithRect$inContext$(CGRect arg0, joc.Pointer<CGContext> arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_renderSnapshotWithRect:inContext:", arg0, arg1);
    }

    /**
     * - (void) _resetZoomingWithEvent:(struct __GSEvent *)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_resetZoomingWithEvent:", types="v12@0:4^{__GSEvent=}8")
    public void _resetZoomingWithEvent$(joc.Pointer<__GSEvent> arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_resetZoomingWithEvent:", arg0);
    }

    /**
     * - (void) _rotateFromEvent:(struct __GSEvent *)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_rotateFromEvent:", types="v12@0:4^{__GSEvent=}8")
    public void _rotateFromEvent$(joc.Pointer<__GSEvent> arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_rotateFromEvent:", arg0);
    }

    /**
     * - (void) _rotateToDegrees:(float)arg0 duration:(float)arg1 event:(struct __GSEvent *)arg2 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_rotateToDegrees:duration:event:", types="v20@0:4f8f12^{__GSEvent=}16")
    public void _rotateToDegrees$duration$event$(float arg0, float arg1, joc.Pointer<__GSEvent> arg2) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_rotateToDegrees:duration:event:", arg0, arg1, arg2);
    }

    /**
     * - (float) _rubberBandScaleForScale:(float)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_rubberBandScaleForScale:", types="f12@0:4f8")
    public float _rubberBandScaleForScale$(float arg0) {
        return (float) (java.lang.Float) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_rubberBandScaleForScale:", arg0);
    }

    /**
     * - (void) _rubberbandZoomToEvent:(struct __GSEvent *)arg0 scale:(float)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_rubberbandZoomToEvent:scale:", types="v16@0:4^{__GSEvent=}8f12")
    public void _rubberbandZoomToEvent$scale$(joc.Pointer<__GSEvent> arg0, float arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_rubberbandZoomToEvent:scale:", arg0, arg1);
    }

    /**
     * - (float) _scaleForInternalScale:(float)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_scaleForInternalScale:", types="f12@0:4f8")
    public float _scaleForInternalScale$(float arg0) {
        return (float) (java.lang.Float) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_scaleForInternalScale:", arg0);
    }

    /**
     * - (id) _scriptingInfo 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_scriptingInfo", types="@8@0:4")
    public Object _scriptingInfo() {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_scriptingInfo");
    }

    /**
     * - (struct CGPoint) _scrollPointForBoundedRect:(struct CGRect)arg0 withBoundary:(struct CGRect)arg1 scale:(float)arg2 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_scrollPointForBoundedRect:withBoundary:scale:", types="{CGPoint=ff}44@0:4{CGRect={CGPoint=ff}{CGSize=ff}}8{CGRect={CGPoint=ff}{CGSize=ff}}24f40")
    public CGPoint _scrollPointForBoundedRect$withBoundary$scale$(CGRect arg0, CGRect arg1, float arg2) {
        return (CGPoint) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_scrollPointForBoundedRect:withBoundary:scale:", arg0, arg1, arg2);
    }

    /**
     * - (struct CGPoint) _scrollPointForPoint:(struct CGPoint)arg0 scale:(float)arg1 constrain:(char)arg2 snapToEdge:(char)arg3 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_scrollPointForPoint:scale:constrain:snapToEdge:", types="{CGPoint=ff}28@0:4{CGPoint=ff}8f16c20c24")
    public CGPoint _scrollPointForPoint$scale$constrain$snapToEdge$(CGPoint arg0, float arg1, byte arg2, byte arg3) {
        return (CGPoint) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_scrollPointForPoint:scale:constrain:snapToEdge:", arg0, arg1, arg2, arg3);
    }

    /**
     * - (id) _scroller 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_scroller", types="@8@0:4")
    public Object _scroller() {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_scroller");
    }

    /**
     * - (struct CGSize) _scrollerContentSize 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_scrollerContentSize", types="{CGSize=ff}8@0:4")
    public CGSize _scrollerContentSize() {
        return (CGSize) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_scrollerContentSize");
    }

    /**
     * - (void) _setContentImage:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_setContentImage:", types="v12@0:4@8")
    public void _setContentImage$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_setContentImage:", arg0);
    }

    /**
     * - (void) _setContentsTransform:(struct CGAffineTransform)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_setContentsTransform:", types="v32@0:4{CGAffineTransform=ffffff}8")
    public void _setContentsTransform$(CGAffineTransform arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_setContentsTransform:", arg0);
    }

    /**
     * - (void) _setInterceptMouseEvent:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_setInterceptMouseEvent:", types="v12@0:4c8")
    public void _setInterceptMouseEvent$(byte arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_setInterceptMouseEvent:", arg0);
    }

    /**
     * - (void) _setIsAncestorOfFirstResponder:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_setIsAncestorOfFirstResponder:", types="v12@0:4c8")
    public void _setIsAncestorOfFirstResponder$(byte arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_setIsAncestorOfFirstResponder:", arg0);
    }

    /**
     * - (void) _setRotationAnimationProgress:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_setRotationAnimationProgress:", types="v12@0:4@8")
    public void _setRotationAnimationProgress$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_setRotationAnimationProgress:", arg0);
    }

    /**
     * - (void) _setZoomAnimationProgress:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_setZoomAnimationProgress:", types="v12@0:4@8")
    public void _setZoomAnimationProgress$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_setZoomAnimationProgress:", arg0);
    }

    /**
     * - (char) _shouldTryPromoteDescendantToFirstResponder 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_shouldTryPromoteDescendantToFirstResponder", types="c8@0:4")
    public byte _shouldTryPromoteDescendantToFirstResponder() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_shouldTryPromoteDescendantToFirstResponder");
    }

    /**
     * - (void) _startGesture:(int)arg0 event:(struct __GSEvent *)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_startGesture:event:", types="v16@0:4i8^{__GSEvent=}12")
    public void _startGesture$event$(int arg0, joc.Pointer<__GSEvent> arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_startGesture:event:", arg0, arg1);
    }

    /**
     * - (char) _startRotationFromEvent:(struct __GSEvent *)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_startRotationFromEvent:", types="c12@0:4^{__GSEvent=}8")
    public byte _startRotationFromEvent$(joc.Pointer<__GSEvent> arg0) {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_startRotationFromEvent:", arg0);
    }

    /**
     * - (char) _startZoomFromEvent:(struct __GSEvent *)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_startZoomFromEvent:", types="c12@0:4^{__GSEvent=}8")
    public byte _startZoomFromEvent$(joc.Pointer<__GSEvent> arg0) {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_startZoomFromEvent:", arg0);
    }

    /**
     * - (void) _stopGesture:(int)arg0 event:(struct __GSEvent *)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_stopGesture:event:", types="v16@0:4i8^{__GSEvent=}12")
    public void _stopGesture$event$(int arg0, joc.Pointer<__GSEvent> arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_stopGesture:event:", arg0, arg1);
    }

    /**
     * - (void) _stopRotationFromEvent:(struct __GSEvent *)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_stopRotationFromEvent:", types="v12@0:4^{__GSEvent=}8")
    public void _stopRotationFromEvent$(joc.Pointer<__GSEvent> arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_stopRotationFromEvent:", arg0);
    }

    /**
     * - (void) _stopZoomFromEvent:(struct __GSEvent *)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_stopZoomFromEvent:", types="v12@0:4^{__GSEvent=}8")
    public void _stopZoomFromEvent$(joc.Pointer<__GSEvent> arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_stopZoomFromEvent:", arg0);
    }

    /**
     * - (char) _subclassImplementsDrawRect 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_subclassImplementsDrawRect", types="c8@0:4")
    public byte _subclassImplementsDrawRect() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_subclassImplementsDrawRect");
    }

    /**
     * - (id) _syntheticTouch 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_syntheticTouch", types="@8@0:4")
    public Object _syntheticTouch() {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_syntheticTouch");
    }

    /**
     * - (id) _syntheticUIEventWithGSEvent:(struct __GSEvent *)arg0 touchPhase:(int)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_syntheticUIEventWithGSEvent:touchPhase:", types="@16@0:4^{__GSEvent=}8i12")
    public Object _syntheticUIEventWithGSEvent$touchPhase$(joc.Pointer<__GSEvent> arg0, int arg1) {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_syntheticUIEventWithGSEvent:touchPhase:", arg0, arg1);
    }

    /**
     * - (id) _touchData 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_touchData", types="@8@0:4")
    public Object _touchData() {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_touchData");
    }

    /**
     * - (float) _zoomAnimationDurationForScale:(float)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_zoomAnimationDurationForScale:", types="f12@0:4f8")
    public float _zoomAnimationDurationForScale$(float arg0) {
        return (float) (java.lang.Float) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_zoomAnimationDurationForScale:", arg0);
    }

    /**
     * - (float) _zoomAnimationProgress 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_zoomAnimationProgress", types="f8@0:4")
    public float _zoomAnimationProgress() {
        return (float) (java.lang.Float) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_zoomAnimationProgress");
    }

    /**
     * - (void) _zoomToEvent:(struct __GSEvent *)arg0 scale:(float)arg1 animate:(char)arg2 constrainScrollPoint:(char)arg3 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_zoomToEvent:scale:animate:constrainScrollPoint:", types="v24@0:4^{__GSEvent=}8f12c16c20")
    public void _zoomToEvent$scale$animate$constrainScrollPoint$(joc.Pointer<__GSEvent> arg0, float arg1, byte arg2, byte arg3) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_zoomToEvent:scale:animate:constrainScrollPoint:", arg0, arg1, arg2, arg3);
    }

    /**
     * - (void) _zoomToScale:(float)arg0 event:(struct __GSEvent *)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_zoomToScale:event:", types="v16@0:4f8^{__GSEvent=}12")
    public void _zoomToScale$event$(float arg0, joc.Pointer<__GSEvent> arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_zoomToScale:event:", arg0, arg1);
    }

    /**
     * - (void) _zoomToScrollPoint:(struct CGPoint)arg0 scale:(float)arg1 duration:(float)arg2 event:(struct __GSEvent *)arg3 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_zoomToScrollPoint:scale:duration:event:", types="v28@0:4{CGPoint=ff}8f16f20^{__GSEvent=}24")
    public void _zoomToScrollPoint$scale$duration$event$(CGPoint arg0, float arg1, float arg2, joc.Pointer<__GSEvent> arg3) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_zoomToScrollPoint:scale:duration:event:", arg0, arg1, arg2, arg3);
    }

    /**
     * - (void) _zoomToWindowPoint:(struct CGPoint)arg0 scale:(float)arg1 duration:(float)arg2 constrainScrollPoint:(char)arg3 event:(struct __GSEvent *)arg4 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_zoomToWindowPoint:scale:duration:constrainScrollPoint:event:", types="v32@0:4{CGPoint=ff}8f16f20c24^{__GSEvent=}28")
    public void _zoomToWindowPoint$scale$duration$constrainScrollPoint$event$(CGPoint arg0, float arg1, float arg2, byte arg3, joc.Pointer<__GSEvent> arg4) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_zoomToWindowPoint:scale:duration:constrainScrollPoint:event:", arg0, arg1, arg2, arg3, arg4);
    }

    /**
     * - (void) _zoomWithEvent:(struct __GSEvent *)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="_zoomWithEvent:", types="v12@0:4^{__GSEvent=}8")
    public void _zoomWithEvent$(joc.Pointer<__GSEvent> arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "_zoomWithEvent:", arg0);
    }

    /**
     * - (id) actionForLayer:(id)arg0 forKey:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="actionForLayer:forKey:", types="@16@0:4@8@12")
    public Object actionForLayer$forKey$(Object arg0, Object arg1) {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "actionForLayer:forKey:", arg0, arg1);
    }

    /**
     * - (void) addAnimation:(id)arg0 forKey:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="addAnimation:forKey:", types="v16@0:4@8@12")
    public void addAnimation$forKey$(Object arg0, Object arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "addAnimation:forKey:", arg0, arg1);
    }

    /**
     * - (void) addSubview:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="addSubview:", types="v12@0:4@8")
    public void addSubview$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "addSubview:", arg0);
    }

    /**
     * - (float) alpha 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="alpha", types="f8@0:4")
    public float alpha() {
        return (float) (java.lang.Float) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "alpha");
    }

    /**
     * - (void) animator:(id)arg0 startAnimation:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="animator:startAnimation:", types="v16@0:4@8@12")
    public void animator$startAnimation$(Object arg0, Object arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "animator:startAnimation:", arg0, arg1);
    }

    /**
     * - (void) animator:(id)arg0 stopAnimation:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="animator:stopAnimation:", types="v16@0:4@8@12")
    public void animator$stopAnimation$(Object arg0, Object arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "animator:stopAnimation:", arg0, arg1);
    }

    /**
     * - (char) autoresizesSubviews 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="autoresizesSubviews", types="c8@0:4")
    public byte autoresizesSubviews() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "autoresizesSubviews");
    }

    /**
     * - (unsigned int) autoresizingMask 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="autoresizingMask", types="I8@0:4")
    public int autoresizingMask() {
        return (int) (java.lang.Integer) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "autoresizingMask");
    }

    /**
     * - (id) backgroundColor 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="backgroundColor", types="@8@0:4")
    public Object backgroundColor() {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "backgroundColor");
    }

    /**
     * - (float) boundedScaleForFocusRect:(struct CGRect)arg0 deviceBoundaryRect:(struct CGRect)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="boundedScaleForFocusRect:deviceBoundaryRect:", types="f40@0:4{CGRect={CGPoint=ff}{CGSize=ff}}8{CGRect={CGPoint=ff}{CGSize=ff}}24")
    public float boundedScaleForFocusRect$deviceBoundaryRect$(CGRect arg0, CGRect arg1) {
        return (float) (java.lang.Float) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "boundedScaleForFocusRect:deviceBoundaryRect:", arg0, arg1);
    }

    /**
     * - (struct CGRect) bounds 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="bounds", types="{CGRect={CGPoint=ff}{CGSize=ff}}8@0:4")
    public CGRect bounds() {
        return (CGRect) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "bounds");
    }

    /**
     * - (void) bringSubviewToFront:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="bringSubviewToFront:", types="v12@0:4@8")
    public void bringSubviewToFront$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "bringSubviewToFront:", arg0);
    }

    /**
     * - (char) canHandleGestures 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="canHandleGestures", types="c8@0:4")
    public byte canHandleGestures() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "canHandleGestures");
    }

    /**
     * - (char) canHandleSwipes 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="canHandleSwipes", types="c8@0:4")
    public byte canHandleSwipes() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "canHandleSwipes");
    }

    /**
     * - (char) cancelMouseTracking 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="cancelMouseTracking", types="c8@0:4")
    public byte cancelMouseTracking() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "cancelMouseTracking");
    }

    /**
     * - (char) cancelTouchTracking 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="cancelTouchTracking", types="c8@0:4")
    public byte cancelTouchTracking() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "cancelTouchTracking");
    }

    /**
     * - (struct CGPoint) center 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="center", types="{CGPoint=ff}8@0:4")
    public CGPoint center() {
        return (CGPoint) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "center");
    }

    /**
     * - (float) charge 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="charge", types="f8@0:4")
    public float charge() {
        return (float) (java.lang.Float) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "charge");
    }

    /**
     * - (char) clearsContextBeforeDrawing 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="clearsContextBeforeDrawing", types="c8@0:4")
    public byte clearsContextBeforeDrawing() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "clearsContextBeforeDrawing");
    }

    /**
     * - (char) clipsToBounds 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="clipsToBounds", types="c8@0:4")
    public byte clipsToBounds() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "clipsToBounds");
    }

    /**
     * - (int) compareTextEffectsOrdering:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="compareTextEffectsOrdering:", types="i12@0:4@8")
    public int compareTextEffectsOrdering$(Object arg0) {
        return (int) (java.lang.Integer) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "compareTextEffectsOrdering:", arg0);
    }

    /**
     * - (char) containsView:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="containsView:", types="c12@0:4@8")
    public byte containsView$(Object arg0) {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "containsView:", arg0);
    }

    /**
     * - (int) contentMode 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="contentMode", types="i8@0:4")
    public int contentMode() {
        return (int) (java.lang.Integer) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "contentMode");
    }

    /**
     * - (struct CGPoint) convertPoint:(struct CGPoint)arg0 fromView:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="convertPoint:fromView:", types="{CGPoint=ff}20@0:4{CGPoint=ff}8@16")
    public CGPoint convertPoint$fromView$(CGPoint arg0, Object arg1) {
        return (CGPoint) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "convertPoint:fromView:", arg0, arg1);
    }

    /**
     * - (struct CGPoint) convertPoint:(struct CGPoint)arg0 toView:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="convertPoint:toView:", types="{CGPoint=ff}20@0:4{CGPoint=ff}8@16")
    public CGPoint convertPoint$toView$(CGPoint arg0, Object arg1) {
        return (CGPoint) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "convertPoint:toView:", arg0, arg1);
    }

    /**
     * - (struct CGRect) convertRect:(struct CGRect)arg0 fromView:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="convertRect:fromView:", types="{CGRect={CGPoint=ff}{CGSize=ff}}28@0:4{CGRect={CGPoint=ff}{CGSize=ff}}8@24")
    public CGRect convertRect$fromView$(CGRect arg0, Object arg1) {
        return (CGRect) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "convertRect:fromView:", arg0, arg1);
    }

    /**
     * - (struct CGRect) convertRect:(struct CGRect)arg0 toView:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="convertRect:toView:", types="{CGRect={CGPoint=ff}{CGSize=ff}}28@0:4{CGRect={CGPoint=ff}{CGSize=ff}}8@24")
    public CGRect convertRect$toView$(CGRect arg0, Object arg1) {
        return (CGRect) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "convertRect:toView:", arg0, arg1);
    }

    /**
     * - (struct CGSize) convertSize:(struct CGSize)arg0 fromView:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="convertSize:fromView:", types="{CGSize=ff}20@0:4{CGSize=ff}8@16")
    public CGSize convertSize$fromView$(CGSize arg0, Object arg1) {
        return (CGSize) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "convertSize:fromView:", arg0, arg1);
    }

    /**
     * - (struct CGSize) convertSize:(struct CGSize)arg0 toView:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="convertSize:toView:", types="{CGSize=ff}20@0:4{CGSize=ff}8@16")
    public CGSize convertSize$toView$(CGSize arg0, Object arg1) {
        return (CGSize) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "convertSize:toView:", arg0, arg1);
    }

    /**
     * - (struct CGImage *) createSnapshotWithRect:(struct CGRect)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="createSnapshotWithRect:", types="^{CGImage=}24@0:4{CGRect={CGPoint=ff}{CGSize=ff}}8")
    public joc.Pointer<CGImage> createSnapshotWithRect$(CGRect arg0) {
        return (joc.Pointer<CGImage>) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "createSnapshotWithRect:", arg0);
    }

    /**
     * - (void) dealloc 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="dealloc", types="v8@0:4")
    public void dealloc() {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "dealloc");
    }

    /**
     * - (void) didAddSubview:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="didAddSubview:", types="v12@0:4@8")
    public void didAddSubview$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "didAddSubview:", arg0);
    }

    /**
     * - (void) didMoveToSuperview 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="didMoveToSuperview", types="v8@0:4")
    public void didMoveToSuperview() {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "didMoveToSuperview");
    }

    /**
     * - (void) didMoveToWindow 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="didMoveToWindow", types="v8@0:4")
    public void didMoveToWindow() {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "didMoveToWindow");
    }

    /**
     * - (void) didRemoveSubview:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="didRemoveSubview:", types="v12@0:4@8")
    public void didRemoveSubview$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "didRemoveSubview:", arg0);
    }

    /**
     * - (void) drawLayer:(id)arg0 inContext:(struct CGContext *)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="drawLayer:inContext:", types="v16@0:4@8^{CGContext=}12")
    public void drawLayer$inContext$(Object arg0, joc.Pointer<CGContext> arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "drawLayer:inContext:", arg0, arg1);
    }

    /**
     * - (void) drawRect:(struct CGRect)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="drawRect:", types="v24@0:4{CGRect={CGPoint=ff}{CGSize=ff}}8")
    public void drawRect$(CGRect arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "drawRect:", arg0);
    }

    /**
     * - (int) enabledGestures 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="enabledGestures", types="i8@0:4")
    public int enabledGestures() {
        return (int) (java.lang.Integer) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "enabledGestures");
    }

    /**
     * - (void) encodeWithCoder:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="encodeWithCoder:", types="v12@0:4@8")
    public void encodeWithCoder$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "encodeWithCoder:", arg0);
    }

    /**
     * - (char) endEditing:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="endEditing:", types="c12@0:4c8")
    public byte endEditing$(byte arg0) {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "endEditing:", arg0);
    }

    /**
     * - (void) exchangeSubviewAtIndex:(int)arg0 withSubviewAtIndex:(int)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="exchangeSubviewAtIndex:withSubviewAtIndex:", types="v16@0:4i8i12")
    public void exchangeSubviewAtIndex$withSubviewAtIndex$(int arg0, int arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "exchangeSubviewAtIndex:withSubviewAtIndex:", arg0, arg1);
    }

    /**
     * - (struct CGRect) extent 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="extent", types="{CGRect={CGPoint=ff}{CGSize=ff}}8@0:4")
    public CGRect extent() {
        return (CGRect) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "extent");
    }

    /**
     * - (void) forceDisplayIfNeeded 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="forceDisplayIfNeeded", types="v8@0:4")
    public void forceDisplayIfNeeded() {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "forceDisplayIfNeeded");
    }

    /**
     * - (struct CGRect) frame 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="frame", types="{CGRect={CGPoint=ff}{CGSize=ff}}8@0:4")
    public CGRect frame() {
        return (CGRect) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "frame");
    }

    /**
     * - (struct CGPoint) frameOrigin 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="frameOrigin", types="{CGPoint=ff}8@0:4")
    public CGPoint frameOrigin() {
        return (CGPoint) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "frameOrigin");
    }

    /**
     * - (void) gestureChanged:(struct __GSEvent *)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="gestureChanged:", types="v12@0:4^{__GSEvent=}8")
    public void gestureChanged$(joc.Pointer<__GSEvent> arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "gestureChanged:", arg0);
    }

    /**
     * - (id) gestureDelegate 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="gestureDelegate", types="@8@0:4")
    public Object gestureDelegate() {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "gestureDelegate");
    }

    /**
     * - (void) gestureEnded:(struct __GSEvent *)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="gestureEnded:", types="v12@0:4^{__GSEvent=}8")
    public void gestureEnded$(joc.Pointer<__GSEvent> arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "gestureEnded:", arg0);
    }

    /**
     * - (void) gestureStarted:(struct __GSEvent *)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="gestureStarted:", types="v12@0:4^{__GSEvent=}8")
    public void gestureStarted$(joc.Pointer<__GSEvent> arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "gestureStarted:", arg0);
    }

    /**
     * - (struct CGRect) hitRect 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="hitRect", types="{CGRect={CGPoint=ff}{CGSize=ff}}8@0:4")
    public CGRect hitRect() {
        return (CGRect) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "hitRect");
    }

    /**
     * - (id) hitTest:(struct CGPoint)arg0 forEvent:(struct __GSEvent *)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="hitTest:forEvent:", types="@20@0:4{CGPoint=ff}8^{__GSEvent=}16")
    public Object hitTest$forEvent$(CGPoint arg0, joc.Pointer<__GSEvent> arg1) {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "hitTest:forEvent:", arg0, arg1);
    }

    /**
     * - (id) hitTest:(struct CGPoint)arg0 withEvent:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="hitTest:withEvent:", types="@20@0:4{CGPoint=ff}8@16")
    public Object hitTest$withEvent$(CGPoint arg0, Object arg1) {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "hitTest:withEvent:", arg0, arg1);
    }

    /**
     * - (char) ignoresMouseEvents 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="ignoresMouseEvents", types="c8@0:4")
    public byte ignoresMouseEvents() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "ignoresMouseEvents");
    }

    /**
     * - (UIView *) init 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="init", types="@\"UIView\"8@0:4")
    public EAGLView init() {
        return (EAGLView) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "init");
    }

    /**
     * - (UIView *) initWithCoder:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="initWithCoder:", types="@\"UIView\"12@0:4@8")
    public EAGLView initWithCoder$(Object arg0) {
        return (EAGLView) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "initWithCoder:", arg0);
    }

    /**
     * - (UIView *) initWithFrame:(struct CGRect)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="initWithFrame:", types="@\"UIView\"24@0:4{CGRect={CGPoint=ff}{CGSize=ff}}8")
    public EAGLView initWithFrame$(CGRect arg0) {
        return (EAGLView) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "initWithFrame:", arg0);
    }

    /**
     * - (UIView *) initWithSize:(struct CGSize)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="initWithSize:", types="@\"UIView\"16@0:4{CGSize=ff}8")
    public EAGLView initWithSize$(CGSize arg0) {
        return (EAGLView) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "initWithSize:", arg0);
    }

    /**
     * - (void) insertSubview:(id)arg0 above:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="insertSubview:above:", types="v16@0:4@8@12")
    public void insertSubview$above$(Object arg0, Object arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "insertSubview:above:", arg0, arg1);
    }

    /**
     * - (void) insertSubview:(id)arg0 aboveSubview:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="insertSubview:aboveSubview:", types="v16@0:4@8@12")
    public void insertSubview$aboveSubview$(Object arg0, Object arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "insertSubview:aboveSubview:", arg0, arg1);
    }

    /**
     * - (void) insertSubview:(id)arg0 atIndex:(int)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="insertSubview:atIndex:", types="v16@0:4@8i12")
    public void insertSubview$atIndex$(Object arg0, int arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "insertSubview:atIndex:", arg0, arg1);
    }

    /**
     * - (void) insertSubview:(id)arg0 below:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="insertSubview:below:", types="v16@0:4@8@12")
    public void insertSubview$below$(Object arg0, Object arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "insertSubview:below:", arg0, arg1);
    }

    /**
     * - (void) insertSubview:(id)arg0 belowSubview:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="insertSubview:belowSubview:", types="v16@0:4@8@12")
    public void insertSubview$belowSubview$(Object arg0, Object arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "insertSubview:belowSubview:", arg0, arg1);
    }

    /**
     * - (char) isDescendantOfView:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="isDescendantOfView:", types="c12@0:4@8")
    public byte isDescendantOfView$(Object arg0) {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "isDescendantOfView:", arg0);
    }

    /**
     * - (char) isEnabled 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="isEnabled", types="c8@0:4")
    public byte isEnabled() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "isEnabled");
    }

    /**
     * - (char) isExclusiveTouch 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="isExclusiveTouch", types="c8@0:4")
    public byte isExclusiveTouch() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "isExclusiveTouch");
    }

    /**
     * - (char) isHidden 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="isHidden", types="c8@0:4")
    public byte isHidden() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "isHidden");
    }

    /**
     * - (char) isHiddenOrHasHiddenAncestor 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="isHiddenOrHasHiddenAncestor", types="c8@0:4")
    public byte isHiddenOrHasHiddenAncestor() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "isHiddenOrHasHiddenAncestor");
    }

    /**
     * - (char) isMultipleTouchEnabled 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="isMultipleTouchEnabled", types="c8@0:4")
    public byte isMultipleTouchEnabled() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "isMultipleTouchEnabled");
    }

    /**
     * - (char) isOpaque 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="isOpaque", types="c8@0:4")
    public byte isOpaque() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "isOpaque");
    }

    /**
     * - (char) isUserInteractionEnabled 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="isUserInteractionEnabled", types="c8@0:4")
    public byte isUserInteractionEnabled() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "isUserInteractionEnabled");
    }

    /**
     * - (id) layer 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="layer", types="@8@0:4")
    public Object layer() {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "layer");
    }

    /**
     * - (void) layoutIfNeeded 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="layoutIfNeeded", types="v8@0:4")
    public void layoutIfNeeded() {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "layoutIfNeeded");
    }

    /**
     * - (void) layoutSubviews 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="layoutSubviews", types="v8@0:4")
    public void layoutSubviews() {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "layoutSubviews");
    }

    /**
     * - (void) movedFromSuperview:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="movedFromSuperview:", types="v12@0:4@8")
    public void movedFromSuperview$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "movedFromSuperview:", arg0);
    }

    /**
     * - (void) movedFromWindow:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="movedFromWindow:", types="v12@0:4@8")
    public void movedFromWindow$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "movedFromWindow:", arg0);
    }

    /**
     * - (void) movedToSuperview:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="movedToSuperview:", types="v12@0:4@8")
    public void movedToSuperview$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "movedToSuperview:", arg0);
    }

    /**
     * - (void) movedToWindow:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="movedToWindow:", types="v12@0:4@8")
    public void movedToWindow$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "movedToWindow:", arg0);
    }

    /**
     * - (char) needsDisplay 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="needsDisplay", types="c8@0:4")
    public byte needsDisplay() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "needsDisplay");
    }

    /**
     * - (char) needsDisplayOnBoundsChange 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="needsDisplayOnBoundsChange", types="c8@0:4")
    public byte needsDisplayOnBoundsChange() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "needsDisplayOnBoundsChange");
    }

    /**
     * - (char) needsWebDocumentViewEventsDirectly 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="needsWebDocumentViewEventsDirectly", types="c8@0:4")
    public byte needsWebDocumentViewEventsDirectly() {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "needsWebDocumentViewEventsDirectly");
    }

    /**
     * - (id) nextResponder 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="nextResponder", types="@8@0:4")
    public Object nextResponder() {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "nextResponder");
    }

    /**
     * - (struct CGPoint) origin 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="origin", types="{CGPoint=ff}8@0:4")
    public CGPoint origin() {
        return (CGPoint) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "origin");
    }

    /**
     * - (char) pointInside:(struct CGPoint)arg0 forEvent:(struct __GSEvent *)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="pointInside:forEvent:", types="c20@0:4{CGPoint=ff}8^{__GSEvent=}16")
    public byte pointInside$forEvent$(CGPoint arg0, joc.Pointer<__GSEvent> arg1) {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "pointInside:forEvent:", arg0, arg1);
    }

    /**
     * - (char) pointInside:(struct CGPoint)arg0 withEvent:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="pointInside:withEvent:", types="c20@0:4{CGPoint=ff}8@16")
    public byte pointInside$withEvent$(CGPoint arg0, Object arg1) {
        return (byte) (java.lang.Byte) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "pointInside:withEvent:", arg0, arg1);
    }

    /**
     * - (void) recursivelyForceDisplayIfNeeded 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="recursivelyForceDisplayIfNeeded", types="v8@0:4")
    public void recursivelyForceDisplayIfNeeded() {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "recursivelyForceDisplayIfNeeded");
    }

    /**
     * - (void) reduceWidth:(float)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="reduceWidth:", types="v12@0:4f8")
    public void reduceWidth$(float arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "reduceWidth:", arg0);
    }

    /**
     * - (void) removeFromSuperview 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="removeFromSuperview", types="v8@0:4")
    public void removeFromSuperview() {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "removeFromSuperview");
    }

    /**
     * - (void) resizeSubviewsWithOldSize:(struct CGSize)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="resizeSubviewsWithOldSize:", types="v16@0:4{CGSize=ff}8")
    public void resizeSubviewsWithOldSize$(CGSize arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "resizeSubviewsWithOldSize:", arg0);
    }

    /**
     * - (void) resizeWithOldSuperviewSize:(struct CGSize)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="resizeWithOldSuperviewSize:", types="v16@0:4{CGSize=ff}8")
    public void resizeWithOldSuperviewSize$(CGSize arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "resizeWithOldSuperviewSize:", arg0);
    }

    /**
     * - (void) rotateToDegrees:(float)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="rotateToDegrees:", types="v12@0:4f8")
    public void rotateToDegrees$(float arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "rotateToDegrees:", arg0);
    }

    /**
     * - (float) rotationDegrees 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="rotationDegrees", types="f8@0:4")
    public float rotationDegrees() {
        return (float) (java.lang.Float) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "rotationDegrees");
    }

    /**
     * - (id) scriptingInfoWithChildren 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="scriptingInfoWithChildren", types="@8@0:4")
    public Object scriptingInfoWithChildren() {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "scriptingInfoWithChildren");
    }

    /**
     * - (void) sendSubviewToBack:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="sendSubviewToBack:", types="v12@0:4@8")
    public void sendSubviewToBack$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "sendSubviewToBack:", arg0);
    }

    /**
     * - (void) setAlpha:(float)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setAlpha:", types="v12@0:4f8")
    public void setAlpha$(float arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setAlpha:", arg0);
    }

    /**
     * - (void) setAutoresizesSubviews:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setAutoresizesSubviews:", types="v12@0:4c8")
    public void setAutoresizesSubviews$(byte arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setAutoresizesSubviews:", arg0);
    }

    /**
     * - (void) setAutoresizingMask:(unsigned int)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setAutoresizingMask:", types="v12@0:4I8")
    public void setAutoresizingMask$(int arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setAutoresizingMask:", arg0);
    }

    /**
     * - (void) setBackgroundColor:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setBackgroundColor:", types="v12@0:4@8")
    public void setBackgroundColor$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setBackgroundColor:", arg0);
    }

    /**
     * - (void) setBounds:(struct CGRect)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setBounds:", types="v24@0:4{CGRect={CGPoint=ff}{CGSize=ff}}8")
    public void setBounds$(CGRect arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setBounds:", arg0);
    }

    /**
     * - (void) setCenter:(struct CGPoint)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setCenter:", types="v16@0:4{CGPoint=ff}8")
    public void setCenter$(CGPoint arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setCenter:", arg0);
    }

    /**
     * - (void) setCharge:(float)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setCharge:", types="v12@0:4f8")
    public void setCharge$(float arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setCharge:", arg0);
    }

    /**
     * - (void) setClearsContext:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setClearsContext:", types="v12@0:4c8")
    public void setClearsContext$(byte arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setClearsContext:", arg0);
    }

    /**
     * - (void) setClearsContextBeforeDrawing:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setClearsContextBeforeDrawing:", types="v12@0:4c8")
    public void setClearsContextBeforeDrawing$(byte arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setClearsContextBeforeDrawing:", arg0);
    }

    /**
     * - (void) setClipsSubviews:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setClipsSubviews:", types="v12@0:4c8")
    public void setClipsSubviews$(byte arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setClipsSubviews:", arg0);
    }

    /**
     * - (void) setClipsToBounds:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setClipsToBounds:", types="v12@0:4c8")
    public void setClipsToBounds$(byte arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setClipsToBounds:", arg0);
    }

    /**
     * - (void) setContentMode:(int)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setContentMode:", types="v12@0:4i8")
    public void setContentMode$(int arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setContentMode:", arg0);
    }

    /**
     * - (void) setContentsPosition:(int)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setContentsPosition:", types="v12@0:4i8")
    public void setContentsPosition$(int arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setContentsPosition:", arg0);
    }

    /**
     * - (void) setEnabled:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setEnabled:", types="v12@0:4c8")
    public void setEnabled$(byte arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setEnabled:", arg0);
    }

    /**
     * - (void) setEnabledGestures:(int)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setEnabledGestures:", types="v12@0:4i8")
    public void setEnabledGestures$(int arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setEnabledGestures:", arg0);
    }

    /**
     * - (void) setExclusiveTouch:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setExclusiveTouch:", types="v12@0:4c8")
    public void setExclusiveTouch$(byte arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setExclusiveTouch:", arg0);
    }

    /**
     * - (void) setFixedBackgroundPattern:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setFixedBackgroundPattern:", types="v12@0:4c8")
    public void setFixedBackgroundPattern$(byte arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setFixedBackgroundPattern:", arg0);
    }

    /**
     * - (void) setFrame:(struct CGRect)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setFrame:", types="v24@0:4{CGRect={CGPoint=ff}{CGSize=ff}}8")
    public void setFrame$(CGRect arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setFrame:", arg0);
    }

    /**
     * - (void) setFrame:(struct CGRect)arg0 forFields:(int)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setFrame:forFields:", types="v28@0:4{CGRect={CGPoint=ff}{CGSize=ff}}8i24")
    public void setFrame$forFields$(CGRect arg0, int arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setFrame:forFields:", arg0, arg1);
    }

    /**
     * - (void) setFrameOrigin:(struct CGPoint)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setFrameOrigin:", types="v16@0:4{CGPoint=ff}8")
    public void setFrameOrigin$(CGPoint arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setFrameOrigin:", arg0);
    }

    /**
     * - (void) setGestureDelegate:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setGestureDelegate:", types="v12@0:4@8")
    public void setGestureDelegate$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setGestureDelegate:", arg0);
    }

    /**
     * - (void) setHidden:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setHidden:", types="v12@0:4c8")
    public void setHidden$(byte arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setHidden:", arg0);
    }

    /**
     * - (void) setMultipleTouchEnabled:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setMultipleTouchEnabled:", types="v12@0:4c8")
    public void setMultipleTouchEnabled$(byte arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setMultipleTouchEnabled:", arg0);
    }

    /**
     * - (void) setNeedsDisplay 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setNeedsDisplay", types="v8@0:4")
    public void setNeedsDisplay() {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setNeedsDisplay");
    }

    /**
     * - (void) setNeedsDisplayInRect:(struct CGRect)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setNeedsDisplayInRect:", types="v24@0:4{CGRect={CGPoint=ff}{CGSize=ff}}8")
    public void setNeedsDisplayInRect$(CGRect arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setNeedsDisplayInRect:", arg0);
    }

    /**
     * - (void) setNeedsDisplayOnBoundsChange:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setNeedsDisplayOnBoundsChange:", types="v12@0:4c8")
    public void setNeedsDisplayOnBoundsChange$(byte arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setNeedsDisplayOnBoundsChange:", arg0);
    }

    /**
     * - (void) setNeedsLayout 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setNeedsLayout", types="v8@0:4")
    public void setNeedsLayout() {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setNeedsLayout");
    }

    /**
     * - (void) setOpaque:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setOpaque:", types="v12@0:4c8")
    public void setOpaque$(byte arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setOpaque:", arg0);
    }

    /**
     * - (void) setOrigin:(struct CGPoint)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setOrigin:", types="v16@0:4{CGPoint=ff}8")
    public void setOrigin$(CGPoint arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setOrigin:", arg0);
    }

    /**
     * - (void) setPosition:(struct CGPoint)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setPosition:", types="v16@0:4{CGPoint=ff}8")
    public void setPosition$(CGPoint arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setPosition:", arg0);
    }

    /**
     * - (void) setRotationBy:(float)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setRotationBy:", types="v12@0:4f8")
    public void setRotationBy$(float arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setRotationBy:", arg0);
    }

    /**
     * - (void) setRotationDegrees:(float)arg0 duration:(double)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setRotationDegrees:duration:", types="v20@0:4f8d12")
    public void setRotationDegrees$duration$(float arg0, double arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setRotationDegrees:duration:", arg0, arg1);
    }

    /**
     * - (void) setSize:(struct CGSize)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setSize:", types="v16@0:4{CGSize=ff}8")
    public void setSize$(CGSize arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setSize:", arg0);
    }

    /**
     * - (void) setTag:(int)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setTag:", types="v12@0:4i8")
    public void setTag$(int arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setTag:", arg0);
    }

    /**
     * - (void) setTapDelegate:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setTapDelegate:", types="v12@0:4@8")
    public void setTapDelegate$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setTapDelegate:", arg0);
    }

    /**
     * - (void) setTransform:(struct CGAffineTransform)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setTransform:", types="v32@0:4{CGAffineTransform=ffffff}8")
    public void setTransform$(CGAffineTransform arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setTransform:", arg0);
    }

    /**
     * - (void) setUserInteractionEnabled:(char)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setUserInteractionEnabled:", types="v12@0:4c8")
    public void setUserInteractionEnabled$(byte arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setUserInteractionEnabled:", arg0);
    }

    /**
     * - (void) setValue:(id)arg0 forGestureAttribute:(int)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setValue:forGestureAttribute:", types="v16@0:4@8i12")
    public void setValue$forGestureAttribute$(Object arg0, int arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setValue:forGestureAttribute:", arg0, arg1);
    }

    /**
     * - (void) setValue:(id)arg0 forKey:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setValue:forKey:", types="v16@0:4@8@12")
    public void setValue$forKey$(Object arg0, Object arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setValue:forKey:", arg0, arg1);
    }

    /**
     * - (void) setZoomScale:(float)arg0 duration:(double)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="setZoomScale:duration:", types="v20@0:4f8d12")
    public void setZoomScale$duration$(float arg0, double arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "setZoomScale:duration:", arg0, arg1);
    }

    /**
     * - (struct CGSize) size 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="size", types="{CGSize=ff}8@0:4")
    public CGSize size() {
        return (CGSize) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "size");
    }

    /**
     * - (struct CGSize) sizeThatFits:(struct CGSize)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="sizeThatFits:", types="{CGSize=ff}16@0:4{CGSize=ff}8")
    public CGSize sizeThatFits$(CGSize arg0) {
        return (CGSize) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "sizeThatFits:", arg0);
    }

    /**
     * - (void) sizeToFit 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="sizeToFit", types="v8@0:4")
    public void sizeToFit() {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "sizeToFit");
    }

    /**
     * - (void) startHeartbeat:(SEL)arg0 inRunLoopMode:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="startHeartbeat:inRunLoopMode:", types="v16@0:4:8@12")
    public void startHeartbeat$inRunLoopMode$(joc.Selector arg0, Object arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "startHeartbeat:inRunLoopMode:", arg0, arg1);
    }

    /**
     * - (int) stateForGestureType:(int)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="stateForGestureType:", types="i12@0:4i8")
    public int stateForGestureType$(int arg0) {
        return (int) (java.lang.Integer) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "stateForGestureType:", arg0);
    }

    /**
     * - (void) stopHeartbeat:(SEL)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="stopHeartbeat:", types="v12@0:4:8")
    public void stopHeartbeat$(joc.Selector arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "stopHeartbeat:", arg0);
    }

    /**
     * - (id) subviews 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="subviews", types="@8@0:4")
    public Object subviews() {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "subviews");
    }

    /**
     * - (id) superview 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="superview", types="@8@0:4")
    public Object superview() {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "superview");
    }

    /**
     * - (int) swipe:(int)arg0 withEvent:(struct __GSEvent *)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="swipe:withEvent:", types="i16@0:4i8^{__GSEvent=}12")
    public int swipe$withEvent$(int arg0, joc.Pointer<__GSEvent> arg1) {
        return (int) (java.lang.Integer) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "swipe:withEvent:", arg0, arg1);
    }

    /**
     * - (int) tag 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="tag", types="i8@0:4")
    public int tag() {
        return (int) (java.lang.Integer) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "tag");
    }

    /**
     * - (id) tapDelegate 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="tapDelegate", types="@8@0:4")
    public Object tapDelegate() {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "tapDelegate");
    }

    /**
     * - (int) textEffectsVisibilityLevel 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="textEffectsVisibilityLevel", types="i8@0:4")
    public int textEffectsVisibilityLevel() {
        return (int) (java.lang.Integer) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "textEffectsVisibilityLevel");
    }

    /**
     * - (struct CGAffineTransform) transform 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="transform", types="{CGAffineTransform=ffffff}8@0:4")
    public CGAffineTransform transform() {
        return (CGAffineTransform) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "transform");
    }

    /**
     * - (id) valueForGestureAttribute:(int)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="valueForGestureAttribute:", types="@12@0:4i8")
    public Object valueForGestureAttribute$(int arg0) {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "valueForGestureAttribute:", arg0);
    }

    /**
     * - (void) viewDidMoveToSuperview 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="viewDidMoveToSuperview", types="v8@0:4")
    public void viewDidMoveToSuperview() {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "viewDidMoveToSuperview");
    }

    /**
     * - (void) viewWillMoveToSuperview:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="viewWillMoveToSuperview:", types="v12@0:4@8")
    public void viewWillMoveToSuperview$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "viewWillMoveToSuperview:", arg0);
    }

    /**
     * - (id) viewWithTag:(int)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="viewWithTag:", types="@12@0:4i8")
    public Object viewWithTag$(int arg0) {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "viewWithTag:", arg0);
    }

    /**
     * - (struct CGRect) visibleBounds 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="visibleBounds", types="{CGRect={CGPoint=ff}{CGSize=ff}}8@0:4")
    public CGRect visibleBounds() {
        return (CGRect) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "visibleBounds");
    }

    /**
     * - (void) willMoveToSuperview:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="willMoveToSuperview:", types="v12@0:4@8")
    public void willMoveToSuperview$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "willMoveToSuperview:", arg0);
    }

    /**
     * - (void) willMoveToWindow:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="willMoveToWindow:", types="v12@0:4@8")
    public void willMoveToWindow$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "willMoveToWindow:", arg0);
    }

    /**
     * - (void) willMoveToWindow:(id)arg0 withAncestorView:(id)arg1 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="willMoveToWindow:withAncestorView:", types="v16@0:4@8@12")
    public void willMoveToWindow$withAncestorView$(Object arg0, Object arg1) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "willMoveToWindow:withAncestorView:", arg0, arg1);
    }

    /**
     * - (void) willRemoveSubview:(id)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="willRemoveSubview:", types="v12@0:4@8")
    public void willRemoveSubview$(Object arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "willRemoveSubview:", arg0);
    }

    /**
     * - (id) window 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="window", types="@8@0:4")
    public Object window() {
        return joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "window");
    }

    /**
     * - (float) zoomScale 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="zoomScale", types="f8@0:4")
    public float zoomScale() {
        return (float) (java.lang.Float) joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "zoomScale");
    }

    /**
     * - (void) zoomToScale:(float)arg0 
     */
    @SuppressWarnings("unchecked")
    @joc.Message(name="zoomToScale:", types="v12@0:4f8")
    public void zoomToScale$(float arg0) {
        joc.Runtime.msgSend(this, incorrect_ ? null : EAGLView.class, "zoomToScale:", arg0);
    }
}
