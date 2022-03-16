package seedu.address.model;

import javafx.collections.ObservableList;
import seedu.address.model.contact.Contact;
import seedu.address.model.patient.Patient;
import seedu.address.model.prescription.Prescription;
<<<<<<< HEAD
import seedu.address.model.testresult.TestResult;
=======
>>>>>>> c7c202bd32bcbf930dbbdce2eda3c1912b2370d4

/**
 * Unmodifiable view of an address book
 */
public interface ReadOnlyAddressBook {

    /**
     * Returns an unmodifiable view of the persons list.
     * This list will not contain any duplicate persons.
     */
    ObservableList<Patient> getPersonList();
    ObservableList<Prescription> getPrescriptionList();

    /**
     * Returns an unmodifiable view of the contacts list.
     * This list will not contain any duplicate persons.
     * @return
     */
    ObservableList<Contact> getContactList();
}
