import SwiftUI
import shared

struct ContentView: View {
	let greet = Greeting().greet()

	var body: some View {
		Text(greet)
            .foregroundColor(Color("primaryContainer"))
        
        Text(greet)
            .foregroundColor(.accentColor)
        
	}
    
    init() {
        for familyName in UIFont.familyNames {
            print("**** \(familyName)")
            for fontName in UIFont.fontNames(forFamilyName: familyName) {
                print("---- \(fontName)")
            }
        }
    }
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
