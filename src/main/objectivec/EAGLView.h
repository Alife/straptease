#import <UIKit/UIKit.h>
#import <OpenGLES/EAGL.h>
#import <OpenGLES/ES1/gl.h>
#import <OpenGLES/ES1/glext.h>

@protocol EAGLViewDelegate;

@interface EAGLView : UIView
{
	@private
	// The pixel dimensions of the backbuffer
	GLint backingWidth;
	GLint backingHeight;

	EAGLContext *context;
	GLuint viewRenderbuffer, viewFramebuffer;
	GLuint depthRenderbuffer;

	id<EAGLViewDelegate> delegate;
	BOOL delegateSetup;
}

@property(nonatomic, assign) id<EAGLViewDelegate> delegate;

-(void)drawView;

@end

@protocol EAGLViewDelegate<NSObject>

@required
-(void)drawView:(EAGLView*)view;

@optional
-(void)setupView:(EAGLView*)view;
@end
