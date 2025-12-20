import kotlin.io.*
fun main() {
    println("Hello, World!");
    println("Welcome to Kotlin programming.");
} 
/**
 * ✅ AcademicSubjectFacultyAssociationTable – Column Descriptions

id
A unique identifier for each subject–faculty association record, ensuring distinct tracking.

subject_id
Identifies the academic subject assigned to the faculty member.

subject_code
The official subject code used to reference and categorize the subject within the curriculum.

employee_id
The unique identifier of the faculty member responsible for teaching the subject.

available_day
Indicates the day(s) of the week when the assigned faculty member is available to teach this subject.

status
Represents the assignment status (e.g., active, inactive, pending), helping manage teaching allocations.

assign
Specifies whether the faculty member is currently assigned to this subject (true/false).

hub_code
Identifies the academic hub where the faculty-subject assignment is applicable.

course_code
The course to which the subject belongs, linking faculty allocation to a specific academic program.

specialization_code
Indicates the specialization under which the subject is categorized for teaching.

batch_id
Specifies the academic batch for which the faculty member is assigned to teach the subject.

semester_id
Identifies the semester in which the faculty member is responsible for teaching this subject.

created_at
The timestamp recording when the subject–faculty association was created.

updated_at
The timestamp recording the most recent update made to the faculty assignment record.

created_by
The identifier of the user who first created the faculty assignment entry.

updated_by
The identifier of the user who last updated the faculty assignment entry.
 * 
 */