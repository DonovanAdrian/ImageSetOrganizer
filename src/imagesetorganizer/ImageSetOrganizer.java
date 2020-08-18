/*
 * This project was created by Donovan Adrian and any
 * edits or changes must be confirmed as valid by Donovan
 * with written consent under any circumstance.
 */
package imagesetorganizer;

/**
 *
 * @author Donovan Adrian
 */
public class ImageSetOrganizer {

    public static void main(String[] args) {
        //Welcome Window
        //Button A - Bring Back Photos
            //Check config file
            //If not set up, Reset Config
            //If set up...
                //Check Print Folders and cross reference with past source folders
                    //Confirm Potential Selection Y/N
                //Query Source Folder (Dialog -> Directory)
                    //Confirm Selection Y/N
            //Bring Back Photos (FEE functions)
            //Confirm That Folders Are Empty (Check Folders in alg)
            //Confirm That It Was Put In The Correct Folder (Check arr with files)
            //Change Name Of Empty Folders (Input Dialog)
            //Confirm folder name changes
            //Photos And Folders Successfully Changed! Exiting Program...
        //Button B - Reset Config
            //Are you sure? Y/N
                //If N, Cancel
                //If Y, Change BOTH Locations
                    //How many image sets will you need to set up?
                        //(Calculator Setup w/ backspace, un-editable text box)
                    //Will these image sets be on the desktop or elsewhere?
                    //LOOP Set location for image set ### (Dialog -> Directory)
                        //once complete, verify that all locations are valid
                            //Add/Open/Remove test text file to ensure that r/w works
                    //Would you like to set up a source folder? Y/N
                    //If N, Setup Complete!
                    //If Y, Continue...
                        //Now you will need to set up the source folder (Dialog -> Directory)
                            //Verify that location is valid again
                    //Setup complete! Would you like to continue using program? Y/N
                        //If N, Exit
                        //If Y, Welcome Page
        //Button C - Exit
            //Duh
    }
    
}