
Example N1

| Object | F# | Python | PHP |
---- | ---- | ---- | ----
| Assessee        | FirstName = "DAVID"| first_name="DAVID",| 'first_name' => 'DAVID'|
|                 | MiddleName = "Stuard"| middle_name="Stuard" | 'middle_name' => 'Stuard'|
|                 | LastName = "HOWARD" | last_name="HOWARD" | 'last_name' => 'HOWARD'|
|                 | DateOfBirth = new DateTime(1990, 02, 02) | date_of_birth=datetime(1990,2,2).date() | 'date_of_birth' => Carbon::create(1990, 02, 02)|
|                 | Phone = "+1 206-266-1000" | phone="+1 206-266-1000" | 'phone' => '+1 206-266-1000'|
|                 | Email = "newtest@gmail.com" | email="newtest@gmail.com" | 'email' => 'newtest@gmail.com'|
|-
| DrivingLicense  | Id = "U1234591"| driving_license_id = DrivingLicenseId("U1234591")|  'id' => 'U1234591'|
|                 | ExpiryDate = new DateTime(2024, 01, 01)| expiry_date=datetime(2024,1,1).date() | 'expiry_date' => Carbon::create(2024, 01, 01) |
|                 | IssuerState = "CA"| issuer_state="CA" | 'issuer_state' => 'CA'|
|-
| Address         | Line1 = ""| line1 = "" | 'line1' => ''|
|                 | Line2 = "" | line2 = "" | 'line2' => ''|
|                 | ZipCode = "" | zipCode = ""  | 'zip_code' => ''|
|                 | Country = "US" | country = "US"| 'country' => 'United States'|
|                 | State = "WA" | 'state = "WA"  | 'state' => 'WA'|



Example N2

| Object | F# | Python | PHP |
---- | ---- | ---- | ----
| Assessee        | FirstName = "Nicole"| first_name="Nicole",| 'first_name' => 'Nicole'|
|                 | MiddleName = ""| middle_name="" | 'middle_name' => ''|
|                 | LastName = "WILLAMSON" | last_name="WILLAMSON" | 'last_name' => 'WILLAMSON'|
|                 | DateOfBirth = new DateTime(1980, 10, 20) | date_of_birth=datetime(1980,10,20).date() | 'date_of_birth' => Carbon::create(1980, 10, 20),
|                 | Phone = "8572044606" | phone="8572044606" | 'phone' => '8572044606'|
|                 | Email = "nicole@gmail.com" | email="nicole@gmail.com" | 'email' => 'nicole@gmail.com'|
|-
| DrivingLicense  | Id = "111119685"| driving_license_id = DrivingLicenseId("111119685")|  'id' => '111119685'|
|                 | ExpiryDate = new DateTime(2026, 04, 02)| expiry_date=datetime(2026,4,2).date() | 'expiry_date' => Carbon::create(2026, 04, 02) |
|                 | IssuerState = "KY"| issuer_state="KY" | 'issuer_state' => 'KY'|
|-
| Address         | Line1 = ""| line1 = "" | 'line1' => ''|
|                 | Line2 = "" | line2 = "" | 'line2' => ''|
|                 | ZipCode = "11766" | zipCode = "11766"  | 'zip_code' => '11766'|
|                 | Country = "US" | country = "US"| 'country' => 'United States'|
|                 | State = "" | 'state = ""  | 'state' => ''|




Example N3

| Object | F# | Python | PHP |
---- | ---- | ---- | ----
| Assessee        | FirstName = "GEORGE"| first_name="GEORGE",| 'first_name' => 'GEORGE'|
|                 | MiddleName = ""| middle_name="" | 'middle_name' => ''|
|                 | LastName = "BANKS" | last_name="BANKS" | 'last_name' => 'BANKS'|
|                 | DateOfBirth = new DateTime(1992, 01, 01) | date_of_birth=datetime(1992,1,1).date() | 'date_of_birth' => Carbon::create(1992, 01, 01),
|                 | Phone = "8322044544" | phone="8322044544" | 'phone' => '8322044544'|
|                 | Email = "george@gmail.com" | email="george@gmail.com" | 'email' => 'george@gmail.com'|
|-
| DrivingLicense  | Id = "111111508"| driving_license_id = DrivingLicenseId("111111508")|  'id' => '111111508'|
|                 | ExpiryDate = new DateTime(2027, 06, 10)| expiry_date=datetime(2027,6,10).date() | 'expiry_date' => Carbon::create(2027, 06, 10) |
|                 | IssuerState = "LA"| issuer_state="LA" | 'issuer_state' => 'LA'|
|-
| Address         | Line1 = "8 Westcliff dr"| line1 = "8 Westcliff dr" | 'line1' => '8 Westcliff dr'|
|                 | Line2 = "" | line2 = "" | 'line2' => ''|
|                 | ZipCode = "" | zipCode = ""  | 'zip_code' => ''|
|                 | Country = "US" | country = "US"| 'country' => 'United States'|
|                 | State = "" | 'state = ""  | 'state' => ''|
