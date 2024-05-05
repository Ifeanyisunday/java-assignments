import java.util.Scanner;

public class Nokia3310 {
	public static void main(String[] args){

	String prompt = """ 
	List of menu functions\n
	1. Phone book
	2. Messages
	3. Chat
	4. Call register
	5. Tones
	6. Settings
	7. Call divert
	8. Games
	9. Calculator
	10. Reminders
	11. Clock
	12. profiles
	13. Sim services""";

	
	System.out.println(prompt);
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number: ");
	int menu = input.nextInt();
	

	switch(menu) {
		case 1:
			System.out.println("Phone book");
			String promptPhonebook = """

			1. Search
			2. Services Nos
			3. Add name
			4. Erase
			5. Edit
			6. Assign Tone
			7. Send b'card
			8. Options
			9. Speed dials
			10.Voice tags
			 0.back""";
			

			System.out.println(promptPhonebook);
			int phonebook = input.nextInt();

			switch(phonebook) {
				case 1:
					System.out.println("Search");
					break;
				case 2:
					System.out.println("Service Nos");
					break;
				case 3:
					System.out.println("Add name");
					break;
				case 4:
					System.out.println("Erase");
					break;
				case 5:
					System.out.println("Edit");
					break;
				case 6:
					System.out.println("Assign tone");
					break;
				case 7:
					System.out.println("Send b'card");
					break;
				case 8:
					System.out.println("Options");
					String promptOptions = """

					1. Type of view
					2. Memory status
					0. Back""";

					System.out.println(promptOptions);
					int options = input.nextInt();
					switch(options){
						case 1:
							System.out.println("Type of view");
							break;
						case 2:
							System.out.println("Memory status");
							break;
						case 0:
							promptIt();
							break;
					}
					break;
				case 9:
					System.out.println("Speed dials");
					break;
				case 10:
					System.out.println("Voice tags");
					break;
				case 0:
					promptIt();
					break;
			}
			break;

		case 2:
			System.out.println("Messages");
			String promptMessages = """

			1. Write messages
			2. Onbox
			3. Outbox
			4. Picture messages
			5. Templates
			6. Smileys
			7. Message settings
			8. Info service
			9. Voice mailbox number
			10.Service command editor
			 0.Back""";

			System.out.println(promptMessages);
			int messages = input.nextInt();

			switch(messages) {
				case 1:
					System.out.println("Write messages");
					break;
				case 2:
					System.out.println("Inbox");
					break;
				case 3:
					System.out.println("Outbox");
					break;
				case 4:
					System.out.println("Picture messages");
					break;
				case 5:
					System.out.println("Templates");
					break;
				case 6:
					System.out.println("Smileys");
					break;
				case 7:
					System.out.println("Message settings");
					String promptMessageSettings = """

					1. Set 1
					2. Common
					0. Back""";

					System.out.println(promptMessageSettings);
					int messagesSettings = input.nextInt();

					switch(messagesSettings) {
					case 1:
						System.out.println("Set 1");
						String promptSet1 = """

						1. Message centre number
						2. Messages sent as
						3. Message validity
						0. Back""";

						System.out.println(promptSet1);
						int set1 = input.nextInt();
						switch(set1) {
						case 1:
							System.out.println("Message centre number");
							break;
						case 2:
							System.out.println("Messages sent as");
							break;
						case 3:
							System.out.println("Message validity");
							break;
						case 0:
							promptIt();
							break;
						}
						break;
					case 2:
						System.out.println("Common");
						String promptCommon = """

						1. Delivery reports
						2. Reply via same centre
						3. Character support
						0. Back""";

						System.out.println(promptCommon);
						int common = input.nextInt();
						switch(common) {
						case 1:
							System.out.println("Delivery reports");
							break;
						case 2:
							System.out.println("Reply via same centre");
							break;
						case 3:
							System.out.println("Character support");
							break;
						case 0:
							promptIt();
							break;
						}
					case 0:
						promptIt();
						break;
					}
					break;
				case 8:
					System.out.println("Info service");
					break;
				case 9:
					System.out.println("Voice mailbox number");
					break;
				case 10:
					System.out.println("Service command editor");
					break;
				case 0:
					promptIt();
					break;
					
			}
			break;
		case 3:
			System.out.println("Chat");
			break;
		case 4:
			System.out.println("Call register");
			String promptCallRegister = """

			1. Missed calls
			2. Received calls
			3. Dialled numbers
			4. Erase recent call lists
			5. Show call duration
			6. Show call costs
			7. Call cost settings
			8. Prepaid credit
			0. Back""";

			System.out.println(promptCallRegister);
			int callRegister = input.nextInt();
			switch(callRegister) {
				case 1:
					System.out.println("Missed calls");
					break;
				case 2:
					System.out.println("Received calls");
					break;
				case 3:
					System.out.println("Dialled numbers");
					break;
				case 4: 
					System.out.println("Erase recent call lists");
					break;
				case 5: 
					System.out.println("Show call duration");
					String promptCallDuration = """

					1. Last call duration
					2. All calls duration
					3. Received calls duration
					4. Dialled calls duration
					5. Clear timers
					0. Back""";

					System.out.println(promptCallDuration);
					int duration = input.nextInt();
					switch(duration) {
						case 1:
							System.out.println("Last call duration");
							break;
						case 2:
							System.out.println("All calls duration");
							break;
						case 3:
							System.out.println("Received calls duration");
							break;
						case 4: 
							System.out.println("Dialled calls duration");
							break;
						case 5: 
							System.out.println("Clear timers");
							break;
						case 0:
							promptIt();
							break;
					}
					break;
				case 6: 
					System.out.println("Show call costs");
					String promptCallCost = """

					1. Last call cost
					2. All calls cost
					3. Clear counters
					0. Back""";

					System.out.println(promptCallCost);
					int cost = input.nextInt();
					switch(cost) {
						case 1:
							System.out.println("Last call cost");
							break;
						case 2:
							System.out.println("All calls cost");
							break;
						case 3:
							System.out.println("Clear counters");
							break;
						case 0:
							promptIt();
							break;
					}
					break;
				case 7: 
					System.out.println("Call cost settings");
					String promptCostSettings = """

					1. Call cost limit
					2. Show costs in
					0. Back""";
					System.out.println(promptCostSettings);

					int callCost = input.nextInt();
					switch(callCost) {
						case 1:
							System.out.println("Call cost limit");
							break;
						case 2:
							System.out.println("Show costs in");
							break;
						case 0:
							promptIt();
							break;
					}
					break;
				case 8: 
					System.out.println("Prepaid credit");
					break;
				case 0:
					promptIt();
					break;
			}
			break;
		case 5:
			System.out.println("Tones");
			String promptTones = """

			1. Ringing tone
			2. Ringing volume
			3. Incoming call alert
			4. Composer
			5. Message alert tone
			6. Keypad Tones
			7. warning and game tones
			8. Vibrating alert
			9. Screen saver
			0. Back""";

			System.out.println(promptTones);
			int tones = input.nextInt();
			switch(tones) {
				case 1:
					System.out.println("Ringing tones");
					break;
				case 2:
					System.out.println("Ringing volume");
					break;
				case 3:
					System.out.println("Incoming call alert");
					break;
				case 4:
					System.out.println("Composer");
					break;
				case 5:
					System.out.println("Message alert tone");
					break;
				case 6:
					System.out.println("Keypad tones");
					break;
				case 7:
					System.out.println("Warning and game tones");
					break;
				case 8:
					System.out.println("Vibrating alert");
					break;
				case 9:
					System.out.println("Screen saver");
					break;
				case 0:
					promptIt();
					break;
			}
			break;
		case 6:
			System.out.println("Settings");
			String promptSettings = """

			1. Call settings
			2. Phone settings
			3. Security settings
			4. Restore factory settings
			0. Back""";

			System.out.println(promptSettings);
			int settings = input.nextInt();
			switch(settings) {
			case 1: 
				System.out.println("Call settings");
				String promptCallSettings = """

				1. Automatic redial
				2. Speed dialling
				3. Call waiting options
				4. Own number sending
				5. Phone line in use
				6. Automatic answer
				0. Back""";

				System.out.println(promptCallSettings);
				int callSettings = input.nextInt();
				switch(callSettings) {
				case 1:
					System.out.println("Automatic redial");
					break;
				case 2:
					System.out.println("Speed dialling");
					break;
				case 3:
					System.out.println("Call waiting options");
					break;
				case 4:
					System.out.println("Own number sending");
					break;
				case 5:
					System.out.println("Phone line in use");
					break;
				case 6:
					System.out.println("Automatic answer");
					break;
				case 0:
					promptIt();
					break;
				}
				break;
			case 2:
				System.out.println("Phone settings");
				String promptPhoneSettings = """

				1. Language
				2. Cell info display
				3. Welcome note
				4. Network selection
				5. Lights
				6. Confirm SIM service actions
				0. Back""";

				System.out.println(promptPhoneSettings);
				int phoneSettings = input.nextInt();
				switch(phoneSettings) {
				case 1:
					System.out.println("Language");
					break;
				case 2:
					System.out.println("Cell info display");
					break;
				case 3:
					System.out.println("Welcome note");
					break;
				case 4:
					System.out.println("Network selection");
					break;
				case 5:
					System.out.println("lights");
					break;
				case 6:
					System.out.println("Confirm SIM service actions");
					break;
				case 0:
					promptIt();
					break;
				}
				break;
			case 3:
				System.out.println("Security settings");
				String promptSecuritySettings = """

				1. PIN code request
				2. Call barring service
				3. Fixed dialling
				4. Closed user group
				5. Phone security
				6. Change access codes
				0. Back""";

				System.out.println(promptSecuritySettings);
				int securitySettings = input.nextInt();
				switch(securitySettings) {
				case 1:
					System.out.println("PIN code request");
					break;
				case 2:
					System.out.println("Call barring service");
					break;
				case 3:
					System.out.println("Fixed dialling");
					break;
				case 4:
					System.out.println("Closed user group");
					break;
				case 5:
					System.out.println("Phone security");
					break;
				case 6:
					System.out.println("Change access codes");
					break;
				case 0:
					promptIt();
					break;
				}
				break;
			case 4:
				System.out.println("Restore factory settings");
				break;
			case 0:
				promptIt();
				break;
			}
			break;
		case 7:
			System.out.println("Call divert");
			break;
		case 8:
			System.out.println("Games");
			break;
		case 9:
			System.out.println("Calculator");
			break;
		case 10:
			System.out.println("Reminders");
			break;
		case 11:
			System.out.println("Clock");
			String promptClock = """

			1. Alarm clock
			2. Clock settings
			3. Date settings
			4. Stopwatch
			5. Countdown timer
			6. Auto update of date and time
			0. Back""";

			System.out.println(promptClock);
			int clock = input.nextInt();
				switch(clock) {
				case 1:
					System.out.println("Alarm clock");
					break;
				case 2:
					System.out.println("Clock settings");
					break;
				case 3:
					System.out.println("Date settings");
					break;
				case 4:
					System.out.println("Stopwatch");
					break;
				case 5:
					System.out.println("Countdown timer");
					break;
				case 6:
					System.out.println("Auto update of date and time");
					break;
				case 0:
					promptIt();
					break;
				}
			break;
		case 12:
			System.out.println("Profiles");
			break;
		case 13:
			System.out.println("SIM services");
			break;
	}

	


}

public static void promptIt(){
String prompt = """ 
	List of menu functions\n
	1. Phone book
	2. Messages
	3. Chat
	4. Call register
	5. Tones
	6. Settings
	7. Call divert
	8. Games
	9. Calculator
	10. Reminders
	11. Clock
	12. profiles
	13. Sim services""";

	
	System.out.println(prompt);
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number: ");
	int menu = input.nextInt();
	

	switch(menu) {
		case 1:
			System.out.println("Phone book");
			String promptPhonebook = """

			1. Search
			2. Services Nos
			3. Add name
			4. Erase
			5. Edit
			6. Assign Tone
			7. Send b'card
			8. Options
			9. Speed dials
			10.Voice tags
			 0.back""";
			

			System.out.println(promptPhonebook);
			int phonebook = input.nextInt();

			switch(phonebook) {
				case 1:
					System.out.println("Search");
					break;
				case 2:
					System.out.println("Service Nos");
					break;
				case 3:
					System.out.println("Add name");
					break;
				case 4:
					System.out.println("Erase");
					break;
				case 5:
					System.out.println("Edit");
					break;
				case 6:
					System.out.println("Assign tone");
					break;
				case 7:
					System.out.println("Send b'card");
					break;
				case 8:
					System.out.println("Options");
					String promptOptions = """

					1. Type of view
					2. Memory status
					0. Back""";

					System.out.println(promptOptions);
					int options = input.nextInt();
					switch(options){
						case 1:
							System.out.println("Type of view");
							break;
						case 2:
							System.out.println("Memory status");
							break;
						case 0:
							promptIt();
							break;
					}
					break;
				case 9:
					System.out.println("Speed dials");
					break;
				case 10:
					System.out.println("Voice tags");
					break;
				case 0:
					System.out.println(prompt);
					break;
			}
			break;

		case 2:
			System.out.println("Messages");
			String promptMessages = """

			1. Write messages
			2. Onbox
			3. Outbox
			4. Picture messages
			5. Templates
			6. Smileys
			7. Message settings
			8. Info service
			9. Voice mailbox number
			10.Service command editor
			 0.Back""";

			System.out.println(promptMessages);
			int messages = input.nextInt();

			switch(messages) {
				case 1:
					System.out.println("Write messages");
					break;
				case 2:
					System.out.println("Inbox");
					break;
				case 3:
					System.out.println("Outbox");
					break;
				case 4:
					System.out.println("Picture messages");
					break;
				case 5:
					System.out.println("Templates");
					break;
				case 6:
					System.out.println("Smileys");
					break;
				case 7:
					System.out.println("Message settings");
					String promptMessageSettings = """

					1. Set 1
					2. Common
					0. Back""";

					System.out.println(promptMessageSettings);
					int messagesSettings = input.nextInt();

					switch(messagesSettings) {
					case 1:
						System.out.println("Set 1");
						String promptSet1 = """

						1. Message centre number
						2. Messages sent as
						3. Message validity
						0. Back""";

						System.out.println(promptSet1);
						int set1 = input.nextInt();
						switch(set1) {
						case 1:
							System.out.println("Message centre number");
							break;
						case 2:
							System.out.println("Messages sent as");
							break;
						case 3:
							System.out.println("Message validity");
							break;
						case 0:
							System.out.println(prompt);
							break;
						}
						break;
					case 2:
						System.out.println("Common");
						String promptCommon = """

						1. Delivery reports
						2. Reply via same centre
						3. Character support
						0. Back""";

						System.out.println(promptCommon);
						int common = input.nextInt();
						switch(common) {
						case 1:
							System.out.println("Delivery reports");
							break;
						case 2:
							System.out.println("Reply via same centre");
							break;
						case 3:
							System.out.println("Character support");
							break;
						case 0:
							System.out.println(prompt);
							break;
						}
						break;
					}
					break;
				case 8:
					System.out.println("Info service");
					break;
				case 9:
					System.out.println("Voice mailbox number");
					break;
				case 10:
					System.out.println("Service command editor");
					break;
				case 0:
					System.out.println(prompt);
					break;
					
			}
			break;
		case 3:
			System.out.println("Chat");
			break;
		case 4:
			System.out.println("Call register");
			String promptCallRegister = """

			1. Missed calls
			2. Received calls
			3. Dialled numbers
			4. Erase recent call lists
			5. Show call duration
			6. Show call costs
			7. Call cost settings
			8. Prepaid credit
			0. Back""";

			System.out.println(promptCallRegister);
			int callRegister = input.nextInt();
			switch(callRegister) {
				case 1:
					System.out.println("Missed calls");
					break;
				case 2:
					System.out.println("Received calls");
					break;
				case 3:
					System.out.println("Dialled numbers");
					break;
				case 4: 
					System.out.println("Erase recent call lists");
					break;
				case 5: 
					System.out.println("Show call duration");
					String promptCallDuration = """

					1. Last call duration
					2. All calls duration
					3. Received calls duration
					4. Dialled calls duration
					5. Clear timers
					0. Back""";

					System.out.println(promptCallDuration);
					int duration = input.nextInt();
					switch(duration) {
						case 1:
							System.out.println("Last call duration");
							break;
						case 2:
							System.out.println("All calls duration");
							break;
						case 3:
							System.out.println("Received calls duration");
							break;
						case 4: 
							System.out.println("Dialled calls duration");
							break;
						case 5: 
							System.out.println("Clear timers");
							break;
						case 0:
							System.out.println(prompt);
							break;
					}
					break;
				case 6: 
					System.out.println("Show call costs");
					String promptCallCost = """

					1. Last call cost
					2. All calls cost
					3. Clear counters
					0. Back""";

					System.out.println(promptCallCost);
					int cost = input.nextInt();
					switch(cost) {
						case 1:
							System.out.println("Last call cost");
							break;
						case 2:
							System.out.println("All calls cost");
							break;
						case 3:
							System.out.println("Clear counters");
							break;
						case 0:
							System.out.println(prompt);
							break;
					}
					break;
				case 7: 
					System.out.println("Call cost settings");
					String promptCostSettings = """

					1. Call cost limit
					2. Show costs in
					0. Back""";
					System.out.println(promptCostSettings);

					int callCost = input.nextInt();
					switch(callCost) {
						case 1:
							System.out.println("Call cost limit");
							break;
						case 2:
							System.out.println("Show costs in");
							break;
						case 0:
							System.out.println(prompt);
							break;
					}
					break;
				case 8: 
					System.out.println("Prepaid credit");
					break;
				case 0:
					System.out.println(prompt);
					break;
			}
			break;
		case 5:
			System.out.println("Tones");
			String promptTones = """

			1. Ringing tone
			2. Ringing volume
			3. Incoming call alert
			4. Composer
			5. Message alert tone
			6. Keypad Tones
			7. warning and game tones
			8. Vibrating alert
			9. Screen saver
			0. Back""";

			System.out.println(promptTones);
			int tones = input.nextInt();
			switch(tones) {
				case 1:
					System.out.println("Ringing tones");
					break;
				case 2:
					System.out.println("Ringing volume");
					break;
				case 3:
					System.out.println("Incoming call alert");
					break;
				case 4:
					System.out.println("Composer");
					break;
				case 5:
					System.out.println("Message alert tone");
					break;
				case 6:
					System.out.println("Keypad tones");
					break;
				case 7:
					System.out.println("Warning and game tones");
					break;
				case 8:
					System.out.println("Vibrating alert");
					break;
				case 9:
					System.out.println("Screen saver");
					break;
				case 0:
					System.out.println(prompt);
					break;
			}
			break;
		case 6:
			System.out.println("Settings");
			String promptSettings = """

			1. Call settings
			2. Phone settings
			3. Security settings
			4. Restore factory settings
			0. Back""";

			System.out.println(promptSettings);
			int settings = input.nextInt();
			switch(settings) {
			case 1: 
				System.out.println("Call settings");
				String promptCallSettings = """

				1. Automatic redial
				2. Speed dialling
				3. Call waiting options
				4. Own number sending
				5. Phone line in use
				6. Automatic answer
				0. Back""";

				System.out.println(promptCallSettings);
				int callSettings = input.nextInt();
				switch(callSettings) {
				case 1:
					System.out.println("Automatic redial");
					break;
				case 2:
					System.out.println("Speed dialling");
					break;
				case 3:
					System.out.println("Call waiting options");
					break;
				case 4:
					System.out.println("Own number sending");
					break;
				case 5:
					System.out.println("Phone line in use");
					break;
				case 6:
					System.out.println("Automatic answer");
					break;
				case 0:
					System.out.println(prompt);
					break;
				}
				break;
			case 2:
				System.out.println("Phone settings");
				String promptPhoneSettings = """

				1. Language
				2. Cell info display
				3. Welcome note
				4. Network selection
				5. Lights
				6. Confirm SIM service actions
				0. Back""";

				System.out.println(promptPhoneSettings);
				int phoneSettings = input.nextInt();
				switch(phoneSettings) {
				case 1:
					System.out.println("Language");
					break;
				case 2:
					System.out.println("Cell info display");
					break;
				case 3:
					System.out.println("Welcome note");
					break;
				case 4:
					System.out.println("Network selection");
					break;
				case 5:
					System.out.println("lights");
					break;
				case 6:
					System.out.println("Confirm SIM service actions");
					break;
				case 0:
					System.out.println(prompt);
					break;
				}
				break;
			case 3:
				System.out.println("Security settings");
				String promptSecuritySettings = """

				1. PIN code request
				2. Call barring service
				3. Fixed dialling
				4. Closed user group
				5. Phone security
				6. Change access codes
				0. Back""";

				System.out.println(promptSecuritySettings);
				int securitySettings = input.nextInt();
				switch(securitySettings) {
				case 1:
					System.out.println("PIN code request");
					break;
				case 2:
					System.out.println("Call barring service");
					break;
				case 3:
					System.out.println("Fixed dialling");
					break;
				case 4:
					System.out.println("Closed user group");
					break;
				case 5:
					System.out.println("Phone security");
					break;
				case 6:
					System.out.println("Change access codes");
					break;
				case 0:
					System.out.println(prompt);
					break;
				}
				break;
			case 4:
				System.out.println("Restore factory settings");
				break;
			}
			break;
		case 7:
			System.out.println("Call divert");
			break;
		case 8:
			System.out.println("Games");
			break;
		case 9:
			System.out.println("Calculator");
			break;
		case 10:
			System.out.println("Reminders");
			break;
		case 11:
			System.out.println("Clock");
			String promptClock = """

			1. Alarm clock
			2. Clock settings
			3. Date settings
			4. Stopwatch
			5. Countdown timer
			6. Auto update of date and time
			0. Back""";

			System.out.println(promptClock);
			int clock = input.nextInt();
				switch(clock) {
				case 1:
					System.out.println("Alarm clock");
					break;
				case 2:
					System.out.println("Clock settings");
					break;
				case 3:
					System.out.println("Date settings");
					break;
				case 4:
					System.out.println("Stopwatch");
					break;
				case 5:
					System.out.println("Countdown timer");
					break;
				case 6:
					System.out.println("Auto update of date and time");
					break;
				case 0:
					System.out.println(prompt);
					break;
				}
			break;
		case 12:
			System.out.println("Profiles");
			break;
		case 13:
			System.out.println("SIM services");
			break;
	}
}



}