


# College Management


The project boils down to a College Management, where you can register Students and associate them with your definitive courses.

## API Reference

### Students Methods

#### Get all students

```SHELL
  GET /students
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `-` | `-` | **Required**. Run the server and has Students registed.|

#### Get unique Student

```SHELL
  GET /students/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | **Required**. Id of student to fetch. |

#### Crate Student

```SHELL
  POST /students
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Name, Age, expected graduation and List of courses`      | `JSON` | **Required**. Parameters to create a Student. |

#### Update Student

```SHELL
  PUT /students/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Name, Age, expected graduation and List of courses`      | `JSON, long` | **Required**. Parameters to alter a Student and ID to update him.|

#### Delete Student

```SHELL
  DELETE /students/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `ID`      | `long` | **Required**. Id of student to delete.|



### Courses Methods

#### Get all Courses

```SHELL
  GET /courses
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `-` | `-` | **Required**. Run the server and has Courses registed.|

#### Get unique Course

```SHELL
  GET /courses/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | **Required**. Id of course to fetch. |

#### Crate Course

```SHELL
  POST /courses
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Name, Duration`      | `JSON` | **Required**. Parameters to create a course. |

#### Update Course

```SHELL
  PUT /courses/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Name, Duration`      | `JSON, long` | **Required**. Parameters to alter a Course and ID to update him.|

#### Delete Course

```SHELL
  DELETE /courses/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `ID`      | `long` | **Required**. Id of course to delete.|



## Tech Stack


**Server:** Java, Spring Boot, Spring Boot Devtool, Mysql,
