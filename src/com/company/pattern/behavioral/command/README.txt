Real world examples:
1) Undo operations. Especially if you need to implement transactional behavior. For example in microservice environment (call few microservices but undo changes if one of the call is failed)
http://sourcephile.blogspot.com/2011/04/how-to-do-undo-and-redo.html
2) Ability to configure action for GUI button in runtime. That way button's object remains the same, but configured for sending different commands. It'd be impossible with direct invocation of the action.
3) Store actions' history with ability to replay them