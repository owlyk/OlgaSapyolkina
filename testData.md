


| Object | F# | Python | PHP |
---- | ---- | ---- | ----
| Assessee        | FirstName = "DAVID"| first_name="DAVID",| 'first_name' => 'DAVID'|
|                 | MiddleName = "Stuard"| middle_name="Stuard" | 'middle_name' => 'Stuard'|
|                 | LastName = "HOWARD" | last_name="HOWARD" | 'last_name' => 'HOWARD'|
|                 | DateOfBirth = new DateTime(1990, 02, 02) | date_of_birth=datetime(1990,2,2).date() | 'date_of_birth' => Carbon::create(1990, 02, 02)|
|                 | Phone = "+1 206-266-1000" | phone="+1 206-266-1000" | 'phone' => '+1 206-266-1000'|
|                 | Email = "newtest@gmail.com" | email="newtest@gmail.com" | 'email' => 'newtest@gmail.com'|
---
| DrivingLicense  | Id = "U1234591"| driving_license_id = DrivingLicenseId("U1234591")|  'id' => 'U1234591'|
|                 | ExpiryDate = new DateTime(2024, 01, 01)| expiry_date=datetime(2024,1,1).date() | 'expiry_date' => Carbon::create(2024, 01, 01) |
|                 | IssuerState = "CA"| issuer_state="CA" | 'issuer_state' => 'CA'|
---
| Address         | Line1 = ""| line1 = "" | 'line1' => ''|
|                 | Line2 = "" | line2 = "" | 'line2' => ''|
|                 | ZipCode = "" | zipCode = ""  | 'zip_code' => ''|
|                 | Country = "US" | country = "US"| 'country' => 'United States'|
|                 | State = "WA" | 'state = "WA"  | 'state' => 'WA'|
---