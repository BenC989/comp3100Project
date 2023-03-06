/*
	1. Create a socket
	2. Initialise input and output streams associated with the socket
	3. Connect to the DS server
	4. Send HELO
	5. Receive OK
	6. Send AUTH username
	7. Receive OK
	8. While the last message from the DS server is not NONE, do:
		Send REDY
		Receive a message
		Send a GETS message
		Receive DATA nRecs recSize
		Send OK
		for(i = 0; i < nRecs; i++){
			Receive each record
			Keep track of the largest server type and the number of servers of that type
		}
		Send OK
		Receive
		If the message received at step 10 is JOBN, then schedule a job
	9. Send QUIT
	10. Receive QUIT
	11. Close the socket
*/
