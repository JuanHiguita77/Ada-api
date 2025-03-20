CREATE TABLE version_company (
    version_company_id INT PRIMARY KEY,
    company_id INT FOREIGN KEY,
    version_id INT FOREIGN KEY UNIQUE,
    version_company_description VARCHAR(255)
);